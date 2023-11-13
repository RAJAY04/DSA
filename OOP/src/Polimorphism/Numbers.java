package Polimorphism;

public class Numbers {
    int sum(int a , int b ){
        //even if you make a argument as double and pass a int in function call it will run the same
        // function but vice versa gives an error, see casting in java for more details
        return a + b;
    }
    int sum ( int a , int b , int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(3,4);
        obj.sum(3,4,4);
       // obj.sum(3,4,4,5);//this gives error because there is no method that
        //takes more than 3 arguments
        //note.txt that even though the memory allocations and stuffs are done during run time
        //but which method to run and all is decided in compile time
    }
}
