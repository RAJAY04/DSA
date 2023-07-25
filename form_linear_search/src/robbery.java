public class robbery {
    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
//        Output: 12
//        Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
//                Total amount you can rob = 2 + 9 + 1 = 12.
        int ans = rob(nums);
        System.out.println(ans);
    }

    public static int rob(int[] nums) {
        int max = 0;
        int n = nums.length;


    }}