package FileHandling;

import java.io.*;

public class Demo {
    public static void main(String[] args) {
//        try(InputStreamReader isr = new InputStreamReader(System.in)){
//            System.out.print("add some number");
//            int letters = isr.read();
//            while(isr.ready()){
//                System.out.println((char)letters);
//                letters = isr.read();
//            }
////            isr.close();
//            //after java 7 try catch block will automatically close it
//            System.out.println();
//        }catch(IOException e ){
//            System.out.println(e.getMessage());
//        }
//        try(FileReader fr = new FileReader("D:\\java\\OOP\\src\\FileHandling\\note.txt")){
//            System.out.println("add some number");
//            int letters = fr.read();//read return an integer val so cant make this a char directly
//            while(fr.ready()){
//                System.out.println((char)letters);
//                letters = fr.read();
//            }
//            System.out.println();
//        }catch(IOException e ){
//            System.out.println(e.getMessage());
//        }
//        //BufferedReader takes parameters of type Reader so we cant just write System.in
//        //Byte to char stream is done by InputStreamReader and then reading the char stream
//        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){//this line can be used for fast ip op in java
//
//            System.out.println("you typed"+br.readLine());
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }
//
//
//        try(BufferedReader br = new BufferedReader(new FileReader("D:\\java\\OOP\\src\\FileHandling\\note.txt"))){
//           while(br.ready()){
//               System.out.println(br.readLine());
//           }
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }

//        OutputStream os = System.out;
//        os.write(🤣); range is exceeded

//        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){
//            osw.write("HELLO");
//            osw.write(10);
//            osw.write(29);
//            osw.write('a');
//            osw.write("\n");
//            char[] arr = "Hello world".toCharArray();
//            osw.write(arr);
////            osw.write(🤣);//its not an character
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }
//
//        try(FileWriter fw = new FileWriter("D:\\java\\OOP\\src\\FileHandling\\note.txt")){
//            fw.write("hello my name is ajay prabhu");//overrides the file
//            fw.write("hello my name is ajay prabhu");
//
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }

//        try(FileWriter fw = new FileWriter("D:\\java\\OOP\\src\\FileHandling\\note.txt",true)){
//            fw.write("hello my name is ajay prabhu");//appends as we have passsed append = true
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }

//        try(BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\java\\OOP\\src\\FileHandling\\note.txt"))){
//            bw.write("Hare Krishna");
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }

    }
}
