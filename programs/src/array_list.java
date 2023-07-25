import java.util.ArrayList;
import java.util.Scanner;

public class array_list {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<Integer>();
        for( int i =10; i < 20 ; i ++){
            num.add(i+1);
        }
        System.out.println(num);
        System.out.println(num.get(4));
        num.set(4,8);
        System.out.println(num);
        num.remove(4);
        System.out.println(num);
        System.out.println(num.contains(14));
        System.out.println(num.contains(15));
        System.out.println(num.isEmpty());
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        for(int i:num) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }
        System.out.println(even+" are evens");
        System.out.println(odd+ " are odds");

        num.clear();
        System.out.println(num.isEmpty());
        System.out.println(num);

        }

    }

