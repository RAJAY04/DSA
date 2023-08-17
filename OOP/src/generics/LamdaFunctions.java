package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class LamdaFunctions {
    //one liner functions can be converted into a lamda functions
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i+1);
        }
        arr.forEach((item) -> System.out.println(item*2));//we see that arr.forEach is taking consumer tye
        //(paremeter) -> body of the function

        Consumer<Integer> fun = (item) -> System.out.println(item*2);
        //interface type  variable = lamda expression
        arr.forEach(fun);
//why we are storing the below in an interface? cz Consumer is also an interface
        //just making type of same thing
        Operation sum = (a,b) -> a + b ;//these are basically body of abstract method present in interface
        Operation diff = (a,b) -> a - b ;
        Operation pro = (a,b) -> a * b ;


        LamdaFunctions my_calculator = new LamdaFunctions();
        System.out.println(my_calculator.operate(5,3,sum));
        System.out.println(my_calculator.operate(5,3,diff));
        System.out.println(my_calculator.operate(5,3,pro));
    }

    private int operate(int a , int b , Operation op){
        return op.operation(a,b);
    }
    int sum(int a , int b){
        return a+b;
    }
}
interface Operation{
        int operation(int a, int b);
}
