public class findMin {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,1,2};
        //Output: 1
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        while(s < e) {
            int mid = s + (e - s) / 2;
            if(nums[mid] < nums[e]) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return nums[s];
        }
    }

