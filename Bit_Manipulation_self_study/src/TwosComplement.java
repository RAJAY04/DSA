public class TwosComplement {
    public static void main(String[] args) {
        //program to demonstrate how twos complement work
        int a = 5 ;
        int negative_num = ~a +1;
        System.out.println(a);
        System.out.println(negative_num);
        System.out.println(Integer.toBinaryString(~a));
        System.out.println(Integer.toBinaryString(~a+1));
        //note that we can read -ve binary number directly
        //to read -ve binary numbers first indentify the sign that one in this case
        //next take complement and add 1 , that gives the magnitude
    }
}
