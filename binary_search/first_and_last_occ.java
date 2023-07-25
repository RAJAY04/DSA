//approach is when we land on the middle element and if the middle element is the target
//it means that there could be more possible answers before or after
//, if we have to search for the first part then run binary search again by making
//  enf = mid - 1 ; and vice versa to search for the next half
import java.util.Arrays;

public class first_and_last_occ {
    public static void main(String[] args) {
        int[] arr = {1,4,4,4,4,6,16};
        int target = 4;
        int[] ans = occ(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    private static int[] occ(int[] arr,int target){
        int[] ans = { -1,-1 };
        int start = search(arr,target,true);
        int end = search(arr,target,false);
        return ans = new int[]{start,end};
    }
    private static int search(int[] arr,int target , boolean first_search){
        int ans =-1;
        int s = 0;
        int e = arr.length - 1;
        while ( s<=e){
            int m = s+(e-s)/2;
            if (target > arr[m]){
                s=m+1;
            } else if (target < arr[m]) {
                e=m-1;
            }else{
                ans = m;
                if(first_search){
                    e=m-1;
                }else{
                    s=m+1;
                }
            }
        }return ans;
    }
}

