public class Richest_customer {
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
//        Output: 17
        int max = maximumWealth(accounts);
        System.out.println(max);
    }

    private static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < accounts.length; i++) {
            sum=0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }if(max<sum){
                max= sum;
            }

        }return max;
    }
}
