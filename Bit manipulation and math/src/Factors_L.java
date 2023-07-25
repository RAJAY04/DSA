import java.util.ArrayList;

public class Factors_L {
    public static void main(String[] args) {
//        factors1(20);
//        factors2(20);
        factors3(20);
    }

    private static void factors1(int n) {//O(N)
        for (int i = 1; i <= n; i++) {
            if(n%i==0) System.out.print(i+" ");
        }
    }
    private static void factors2(int n) {//O(sqrt(n))
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) System.out.print(i + " ");
                else System.out.print(i + " " + n / i + " ");
            }
        }
    }
    private static void factors3(int n) {//both time ans space O(sqrt(n))
        ArrayList <Integer> arr = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) System.out.print(i + " ");
                else{
                    arr.add(n/i);
                    System.out.print(i + " " );
                }
            }
        }
        for (int i = arr.size()-1; i >= 0; i--) {
            System.out.print(arr.get(i)+" ");
        }
    }
}
