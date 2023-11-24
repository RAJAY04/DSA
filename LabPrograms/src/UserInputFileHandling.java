import java.io.*;

public class UserInputFileHandling {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            // Create a new file or truncate an existing one
            File file = new File("output.txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            // Write to file
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            System.out.println("Enter some text:");
            String input = reader.readLine();
            bufferedWriter.write(input);
            bufferedWriter.newLine(); // Add a new line for clarity
            bufferedWriter.close(); // Close the BufferedWriter

            System.out.println("Successfully wrote to the file.");

            // Read from file
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            System.out.println("Reading from the file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the readers
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while working with the file.");
            e.printStackTrace();
        } finally {
            try {
                reader.close(); // Close the BufferedReader
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
