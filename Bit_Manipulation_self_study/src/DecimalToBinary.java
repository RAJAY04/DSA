public class DecimalToBinary {
    public static void main(String[] args) {
        int num = Integer.MAX_VALUE+1;
        for (int i = 31; i >=0; i--) {
            System.out.print((num>>i)&1);
        }
        System.out.println();
        System.out.println(Integer.toBinaryString(num));
    }
}
