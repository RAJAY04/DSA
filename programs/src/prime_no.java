import java.util.Scanner;

public class prime_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            System.out.print("Enter the starting range: ");
            int sr = in.nextInt();
            System.out.print("Enter the ending range: ");
            int er = in.nextInt();
            for( int i = sr; i <= er ; i++){
                boolean flag = false;
                for ( int j = 2 ; j < i ; j++){
                    if (i%j==0) {
                        flag = false;
                        break;
                    }else{
                        flag=false;
                    }
                    if(flag == true){
                        System.out.println(i);
                }

                }
            }

    }
}
