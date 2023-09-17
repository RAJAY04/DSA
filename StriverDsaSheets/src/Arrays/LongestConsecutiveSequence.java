package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
       int[] nums = {9,1,4,7,3,-1,0,5,8,-1,6};
//        Output: 9
        System.out.println(longestConsecutive(nums));
    }
    //this is the solution i found on leetcode ans is easy to understand
    public static int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        int max = 0;
        //adding all the elements to the set
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            int cnt = 1;

            //look left
            int num = nums[i];
            while(set.contains(--num)){
                cnt++;
                set.remove(num);
            }

            //look right
            num = nums[i];
            while(set.contains(++num)){
                cnt++;
                set.remove(num);
            }
            max = Math.max(max,cnt);
        }
        return max;
    }
    public static int longestConsecutive1(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        // Find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }

    public static int longestConsecutive2(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        //sort the array:
        Arrays.sort(nums);
        int lastSmaller = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 1;

        //find longest sequence:
        for (int i = 0; i < n; i++) {
            if (nums[i] - 1 == lastSmaller) {
                //a[i] is the next element of the
                //current sequence.
                cnt += 1;
                lastSmaller = nums[i];
            } else if (nums[i] != lastSmaller) {
                cnt = 1;
                lastSmaller = nums[i];
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }
    public static int longestConsecutive3(int[] nums) {
        if(nums.length == 0)return 0 ;
        int ans = 1;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int count = 1;
            while(linearSearch(nums,x + 1)){
                x++;
                count++;
                ans = Math.max(ans , count);
        }
        }return ans;
    }
    public static boolean linearSearch(int[] nums , int x){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == x)return true;
        }return false;
    }
}
