public class RotatedBsII {
    public static void main(String[] args) {
        int[] nums = {3,1};//[1,1,1,1,1,1,2,1,1,1,1] here we cant see if left part is less than mid
        int target = 1;//hence make sure to take care of the duplicate elements
        System.out.println(search(nums,target));
    }
    public static boolean search(int[] nums, int target) {
        return bs(nums,target,0,nums.length-1);
    }
    public static boolean bs(int[] nums,int target, int s, int e){
        if(s > e){//when mid start end all lie in same index and mid is the ans then it gives false if
            return false;//we use s>=e, so careful
        }
        int mid = s + (e - s)/2;
        if(target == nums[mid]){
            return true;
        }
        if(nums[s] == nums[mid] && nums[mid] == nums[e]) {
            return bs(nums,target,s+1,e-1);//skip the duplicate values
            //left half is sorted
        }else if(nums[s] <= nums[mid]){
            if(target >= nums[s] && target <= nums[mid]){
                return bs(nums,target,s,mid-1);
            }else{//right half is sorted
                return bs(nums,target,mid+1,e);
            }
        }else{
            if(target >= nums[mid] && target <= nums[e]){
                return bs(nums,target,mid+1,e);
            }else{
                return bs(nums,target,s,mid-1);
            }
//Time Complexity: O(log n)
//Space Complexity: O(log n)due to recursion
        }
    }

    public boolean search1(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) return true;

            //if there are duplicates
            if(nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start ++;
                end --;
            }

            //left half is sorted
            else if(nums[start] <= nums[mid]) {
                if(target >= nums[start] && target <= nums[mid])
                    end = mid - 1;

                else
                    start = mid + 1;
            }

            //right half is sorted
            else {
                if(target <= nums[end] && target >= nums[mid])
                    start = mid + 1;

                else
                    end = mid - 1;
            }
        }
        return false;
    }
    //note that in worst case it may take O(N) when [1,1,1,1,1,1,1,1]
    //we modify the traditional binary search to solve the problem and its called augmented binary search
}
