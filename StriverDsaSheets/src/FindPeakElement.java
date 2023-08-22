public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2};
//        Output: 2
        System.out.println(findPeakElement(nums));

    }
    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        int s = 1 , e = n-2;//to avoid edge cases we dont consider 1st and last ele as we
        if(nums.length == 1)return 0;//check them manually
        if(nums[0] > nums[1])return 0;
        else if(nums[n-1] > nums[n-2])return e+1;
        while(s <= e){
            int mid = s + (e - s)/2;
            if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]) {
                return mid;
            }
            else if(nums[mid] < nums[mid+1] ){
                s = mid + 1;
            }else{//dont right else if nums[mid] > nums[mid-1]
                e = mid - 1 ;
            }
        } return -1;//this will never execute as there will always be a peak
        //just writing to satisfy the return type of the function
    }
}

