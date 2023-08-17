import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
       int[] nums = {2,2,1,1,1,2,2};
        //Output: 2
        System.out.println(majorityElement1(nums));
    }

    public static int majorityElement1(int[] nums) {//moore voting algo O(N) and O(1) tc ans sc
        //since in the qn its given that the maj ele does exist and occurs more than n/2 times
        //eventually the majority and minority gets cancelled and the value of the majority ele
        //will be >0 and the candidate will hold that value
        int count = 0 , candidate = 0;
        for (int num: nums) {
            if(count == 0){
                candidate = num;
            }
            if(candidate == num) count++;
            else count--;
        }return candidate;
    }
    public static int majorityElement(int[] nums) {
        //this is my code having a bad complexity
        Arrays.sort(nums);
        int count = 1;
        int curr_count = 0;
        int curr_num = nums[0];
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]){
                count++;
            }else if (curr_count < count) {
                curr_count = count;
                count = 1;
                curr_num = nums[i];
            }

            }
        if (curr_count < count) {//if in case last ele after sorting is major we check here
            return nums[nums.length - 1];
        }
        return curr_num;
        }
        //// Sorting
    //public int majorityElement1(int[] nums) {
    //    Arrays.sort(nums);
    //    return nums[nums.length/2];
    //}
    //
    //// Hashtable
    //public int majorityElement2(int[] nums) {
    //    Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
    //    //Hashtable<Integer, Integer> myMap = new Hashtable<Integer, Integer>();
    //    int ret=0;
    //    for (int num: nums) {
    //        if (!myMap.containsKey(num))
    //            myMap.put(num, 1);
    //        else
    //            myMap.put(num, myMap.get(num)+1);
    //        if (myMap.get(num)>nums.length/2) {
    //            ret = num;
    //            break;
    //        }
    //    }
    //    return ret;
    //}
    //
    //// Moore voting algorithm
    //public int majorityElement3(int[] nums) {
    //    int count=0, ret = 0;
    //    for (int num: nums) {
    //        if (count==0)
    //            ret = num;
    //        if (num!=ret)
    //            count--;
    //        else
    //            count++;
    //    }
    //    return ret;
    //}
    //
    //// Bit manipulation
    //public int majorityElement(int[] nums) {
    //    int[] bit = new int[32];
    //    for (int num: nums)
    //        for (int i=0; i<32; i++)
    //            if ((num>>(31-i) & 1) == 1)
    //                bit[i]++;
    //    int ret=0;
    //    for (int i=0; i<32; i++) {
    //        bit[i]=bit[i]>nums.length/2?1:0;
    //        ret += bit[i]*(1<<(31-i));
    //    }
    //    return ret;
    //}
    }
