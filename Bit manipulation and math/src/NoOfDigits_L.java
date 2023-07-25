public class NoOfDigits_L {
    public static void main(String[] args) {
        int n = 6;
        int base =2;
        System.out.println(ans(n,base));
    }

    private static int ans(int n, int base) {
        return (int)(Math.log(n)/Math.log(base))+1;
    }

}
