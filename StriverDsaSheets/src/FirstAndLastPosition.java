import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = new int[]{-1,-1};
        int start = search(nums,true,target);
        if(start == -1)System.out.println(Arrays.toString(new int[]{-1,-1}));
        //if the first index is not found then dont search for second
        int end = search(nums,false,target);
        System.out.println(Arrays.toString(ans = new int[]{start,end}));
    }
    static int search(int[] nums,boolean first_search,int target){
        int ans = -1;
        int s = 0, e = nums.length-1;
        while(s <= e){
            int mid = s + ( e - s )/2;
            if(nums[mid] > target){
                e = mid-1;
            }else if(nums[mid] < target){
                s = mid +1;
            }else{
                ans = mid;
                if(first_search){
                    e = mid-1;
                }else{
                    s = mid+1;
                }
            }
        }return ans;
    }
}
