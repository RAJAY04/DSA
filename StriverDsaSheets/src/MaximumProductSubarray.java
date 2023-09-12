public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
//        Output: 6
//        Explanation: [2,3] has the largest product 6.
        System.out.println(maxProduct(nums));
    }
    //there are two optimal solution for this problem , 1 is observation based and other
    //one is modified kadanes algo , but dont prefer kadane because 1st approach is more logical and better


    //this is a observation based problem
    //1. all positives
    //2.even number of negatives
    //in above 2 case we dont need to worry
    //3.odd neg
    //4.zeroes
    //how to handle odd negatives?
    //wkt our ans will be either prefix or suffix for each -ve num we consider to ignore
    //using prefix product and suffix product and taking max of both of them
    //how do we handle 0?
    //just turn back the suff and pref to 1 whenever it becomes 0
    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int pref = 1 , suff = 1 , max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(pref == 0)pref = 1;
            if(suff == 0)suff = 1;
            pref *= nums[i];
            suff *= nums[n - i - 1];
            max = Math.max(max,Math.max(suff,pref));
        }return max;
    }

    //brute force
    public static int maxProduct1(int[] nums) {
        int result = nums[0];
        for(int i=0;i<nums.length-1;i++) {
            int p = nums[i];
            for(int j=i+1;j<nums.length;j++) {
                result = Math.max(result,p);
                p *= nums[j];
            }
            result = Math.max(result,p);
        }
        return result;
    }
}
