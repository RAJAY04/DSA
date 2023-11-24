import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        // Read from file and copy to another file
        try {
            File inputFile = new File("input.txt");
            File outputFile = new File("output.txt");

            // Create a new output file if it doesn't exist
            if (!outputFile.exists()) {
                outputFile.createNewFile();
            }

            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line;
            System.out.println("Copying data from input.txt to output.txt:");
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine(); // Add a new line for each line in the input file
            }

            bufferedReader.close();
            bufferedWriter.close();
            System.out.println("Copy successful.");

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}
