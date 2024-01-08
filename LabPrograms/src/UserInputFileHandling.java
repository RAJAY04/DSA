import java.io.*;

public class UserInputFileHandling {
    public static void main(String[] args) {
        try {
            // Create or truncate the input file
            File inFile = new File("input.txt");
            if (!inFile.exists()) {
                inFile.createNewFile();
            }

            // Write to the input file using FileWriter
            FileWriter inWriter = new FileWriter(inFile);
            BufferedWriter brIn = new BufferedWriter(inWriter);

            String inputText = "Hello, FileWriter!"; // Replace with your text
            brIn.write(inputText);
            brIn.newLine(); // Add a new line for clarity
            brIn.close(); // Close the BufferedWriter

            System.out.println("Successfully wrote to the input file.");

            // Read from the input file using BufferedReader
            FileReader inReader = new FileReader(inFile);
            BufferedReader brInReader = new BufferedReader(inReader);

            System.out.println("Reading from the input file:");
            String inLine;
            while ((inLine = brInReader.readLine()) != null) {
                System.out.println(inLine);
            }
            brInReader.close(); // Close the BufferedReader for the input file

            // Create the output file
            File outFile = new File("output.txt");
            if (!outFile.exists()) {
                outFile.createNewFile();
            }

            // Copy contents from the input file to the output using FileWriter
            FileWriter outWriter = new FileWriter(outFile);
            BufferedWriter brOut = new BufferedWriter(outWriter);

            // Reset the BufferedReader to read from the beginning of the input file
            brInReader = new BufferedReader(new FileReader(inFile));

            while ((inLine = brInReader.readLine()) != null) {
                brOut.write(inLine);
                brOut.newLine(); // Add a new line for clarity
            }

            brInReader.close(); // Close the BufferedReader for the input file
            brOut.close(); // Close the BufferedWriter for the output file

            System.out.println("Successfully copied contents from the input file to the output.");

            // Display contents of the output file using BufferedReader
            brInReader = new BufferedReader(new FileReader(outFile));

            System.out.println("Reading from the output file:");
            while ((inLine = brInReader.readLine()) != null) {
                System.out.println(inLine);
            }
            brInReader.close(); // Close the BufferedReader for the output file

        } catch (IOException e) {
            System.out.println("An error occurred while working with the files.");
            e.printStackTrace();
        }
    }
}
