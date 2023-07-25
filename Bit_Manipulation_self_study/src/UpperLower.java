public class UpperLower {
    public static void main(String[] args) {
        //differnece between uppercase and lowercase letters is that
        // in upper case 5th bit != 1; in lower case 5th bit ==1
        System.out.println('C'|(1<<5));//convert char to lower case
        System.out.println('c'&(~(1<<5)));//convert char to upper case
        //actually 1<<5 is space ' '
        System.out.println(' '== (1<<5));
        System.out.println('C'|' ');//convert char to lower case
        System.out.println('c'&'_');////convert char to upper case




    }
}
