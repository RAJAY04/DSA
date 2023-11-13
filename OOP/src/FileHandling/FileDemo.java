package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {

        //creating a file
        //creating a file
        try {
            File fo = new File("D:\\java\\OOP\\src\\FileHandling\\new.txt");
            boolean fileCreated = fo.createNewFile();
            if (fileCreated) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists or couldn't create the file.");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //writing
        try (FileWriter fr = new FileWriter("D:\\java\\OOP\\src\\FileHandling\\new.txt")) {
            fr.write("dinkachika");
            System.out.println("Content written successfully.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //reading
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\java\\OOP\\src\\FileHandling\\new.txt"))){
            bw.write("Hare Krishna");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }


        //deleteing
        try {
            File fo = new File("D:\\java\\OOP\\src\\FileHandling\\random.txt");
            boolean fileCreated = fo.createNewFile();
            fo.delete();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



        }
}
