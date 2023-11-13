package ExceptionHandling;

public class Main {
    public static void main(String[] args) throws MyException {
        int a = 5;
        int b = 0;
//        int c = a/b;
        //public class ArithmeticException extends RuntimeException {
        //public class RuntimeException extends Exception {
        //public class Exception extends Throwable {
        //The Throwable class is the superclass of all errors and
        // exceptions in the Java language. Only objects that are
        // instances of this class (or one of its subclasses) are
        //  thrown by the Java Virtual Machine or can be thrown by the Java throw statement.
        try{
            //divide(a,b);
            String name = "ajay";
            if(name.equals("ajay")){
                throw new MyException("name is ajay");
            }

        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            //ArithmaticException of Exception both will work fine
            //both are classes and there are many methods
        }catch(MyException e){
            throw new MyException("this is from MyException");
        }catch(Exception e){
            //note.txt that the Exception catches all type of exception hence if we use arithmatic exception
            //after the exception it gives an error as its a unreachable statement
        }finally {
            System.out.println("this will always execute");
            //exception is thrown or not it will always run
            //there can be only one finally block
        }
    }
    static int divide(int a , int b) throws ArithmeticException{
        if( b == 0){//whenever we throw a expression declare it above
            throw new ArithmeticException("dont divide by 0 \uD83D\uDE43");//explicitely mentioning
        }return a/b;//just adding a emoji code for fun
    }
}
