public class SetBits_L {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(Integer.toBinaryString(n));
        int count = 0;
        while(n>0){
            n=n-(n&(-n));
            count++;
        } System.out.println(count);
    }
}
