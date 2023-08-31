public class FindSmallestDivisor {
    public static void main(String[] args) {
        int [] nums = {21212,10101,12121};
        int threshold = 1000000;
        System.out.println(smallestDivisor(nums,threshold));
    }
    public static int smallestDivisor(int[] nums, int threshold) {
        //what i learnt : when we use while(low <= high) use high  = mid -1
        //when we use while(low < high) use high  = mid
        int n = nums.length , max = nums[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max,nums[i]);
        }
        int low = 1 , high = max;
        while( low < high){
            int mid = low + ( high - low )/2;
            if(findThreshold(nums,threshold,mid) > threshold){
                low = mid +1;
            }else{
                high = mid;
            }
        }return low;
    }

    private static int findThreshold(int[] nums, int threshold, int divisor) {
        int cur_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            cur_sum += Math.ceil((double) nums[i]/divisor);
            if(cur_sum > threshold)return cur_sum;
        }return cur_sum;
    }
}
