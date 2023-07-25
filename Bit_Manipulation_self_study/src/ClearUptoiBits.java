public class ClearUptoiBits {
    //this program may not be that usefull
    public static void main(String[] args) {
        int a = 31;
        int i = 4;
        System.out.println(Integer.toBinaryString(a));
        int b = (a&(~((1<<(i))-1)));//clearing the lsb upto ith bit
        System.out.println(Integer.toBinaryString(b));
    }
}
