public class SingleElement {
    public static void main(String[] args) {
        int [] nums = {1,1,2,3,3,4,4,8,8};
       // Output: 2
        System.out.println(singleNonDuplicate1(nums));
    }
    //this bitmanipulation solution gives O(n) but we want O(logn)
    public static int singleNonDuplicate(int[] nums) {
        int ans = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            ans^=nums[i];
        }return ans;
    }
    public static  int singleNonDuplicate1(int[] nums) {
        //EXPLANATION:-
        //Suppose array is [1, 1, 2, 2, 3, 3, 4, 5, 5]
        //we can observe that for each pair,
        //first element takes even position and second element takes odd position
        //for example, 1 is appeared as a pair,
        //so it takes 0 and 1 positions. similarly for all the pairs also.
        //
        //this pattern will be missed when single element is appeared in the array.
        //
        //From these points, we can implement algorithm.
        //1. Take left and right pointers .
        //    left points to start of list. right points to end of the list.
        //2. find mid.
        //    if mid is even, then it's duplicate should be in next index.
        //	or if mid is odd, then it's duplicate  should be in previous index.
        //	check these two conditions,
        //	if any of the conditions is satisfied,
        //	then pattern is not missed,
        //	so check in next half of the array. i.e, left = mid + 1
        //	if condition is not satisfied, then the pattern is missed.
        //	so, single number must be before mid.
        //	so, update end to mid.
        //3. At last return the nums[left]
        //
        //Time: -  O(logN)
        int s = 0;
        int e = nums.length - 1;
        while(s < e) {
            int mid = s + (e - s) / 2;
            if((mid % 2 == 0 && nums[mid] == nums[mid +1]) ||(mid %2 == 1 && nums[mid] == nums[mid - 1])){
                s = mid + 1 ;//(even,odd)->ele in right half
            }else{
                e = mid;//(odd,even)->ele in left half
            }
        }return nums[s];
    }
}
