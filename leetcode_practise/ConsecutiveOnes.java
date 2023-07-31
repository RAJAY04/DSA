public class ConsecutiveOnes {
    public static void main(String[] args) {
        int [] nums = {0,0};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        if(nums.length == 0){
            return 0;
        }
        for( int i = 0; i < nums.length; i++){
            if( nums[i] == 1){
                count++;
                max = Math.max(max,count);
            }else{
                count = 0;
            }
        }return max;
    }
}
