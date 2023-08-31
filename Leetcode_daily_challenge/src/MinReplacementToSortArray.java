public class MinReplacementToSortArray {
    public static void main(String[] args) {
        int[] nums = {3,9,3};
//        Output: 2
//        Explanation: Here are the steps to sort the array in non-decreasing order:
//        - From [3,9,3], replace the 9 with 3 and 6 so the array becomes [3,3,6,3]
//        - From [3,3,6,3], replace the 6 with 3 and 3 so the array becomes [3,3,3,3,3]
//        There are 2 steps to sort the array in non-decreasing order. Therefore, we return 2.
        System.out.println(minimumReplacement(nums));
    }

    //this problem used greedy approach to solve
    //we need to find the minimum number of steps to sort the array in non-decreasing order
    //we iterate from the end of the array and find the number of steps required to make the
    // current element equal to the previous element
    //and note that we must try to maximise the minimum element so that the prev number no need to break
    //it down more
    //for eg 3,13,3 here we can make 13 to 3 by 13/3 = 4 steps
    //and we add the remainder to the next element and make it 3 + 1 = 4
    //in general we add the remainder to maximise the minimun element so that
    //the prev number takes min number of breakdown

    public static long minimumReplacement(int[] nums) {
        long res = 0;
        int n = nums.length;
        long MinMaxVal = nums[n-1];
        for (int i = n - 2; i >= 0; i--) {
            long parts = (long) Math.ceil((double)nums[i] /(double) MinMaxVal);
            //number of steps is part - 1;
            res += parts - 1;
            //the new maximised minimum value is a part
            MinMaxVal = nums[i] / parts;
        }
        return res;
    }


    public long minimumReplacement1(int[] nums) {
        int n = nums.length;
        int last = nums[n - 1];  // Initialize 'last' with the last element
        long ans = 0;  // Initialize the total operations count

        // Traverse the array in reverse order
        for (int i = n - 2; i >= 0; --i) {
            if (nums[i] > last) {  // If the current element needs replacement
                int t = nums[i] / last;  // Calculate how many times the element needs to be divided
                if (nums[i] % last != 0) {
                    t++;  // If there's a remainder, increment 't'
                }
                last = nums[i] / t;  // Update 'last' for the next comparison
                ans += t - 1;  // Add (t - 1) to 'ans' for the number of operations
            } else {
                last = nums[i];  // Update 'last' without replacement
            }
        }
        return ans;  // Return the total number of operations
    }
}
