//the approach will be finding the peak value and searching the ascending part ,
//if the element not found in the ascending part then search for the descending part

public class bs_mountain_arr {
    public static void main(String[] args) {
        int[] arr = {1, 3 , 4 , 5 , 6 , 7 , 8 , 4 , 3 , 1};
        int target = 8;
        int peak = ans(arr);
//        passing the peak value obtained from one function to other
        int ans = bs(arr,target,peak);
        System.out.println(ans);
    }

    private static int ans(int[] arr) {
//        the work of this function is to find the peak value and return it
        int s = 0;
        int e = arr.length-1;
        while(s< e){
            int m = s +(e-s)/2;
            if(arr[m]>arr[m+1]){
                e=m;
            }else{
                s=m+1;
            }
        }return s;
    }
    private static int bs(int[] arr,int target,int peak){
        boolean test = true;
        if(test){
            int s = 0;
            int e = peak;
            while(s<=e){
                int mid = s +(e-s)/2;
                if(arr[mid]>target){
                    e=mid-1;
                }else if(arr[mid]<target){
                    s=mid+1;
                }else{
                    return mid;
                }
            }
        }test = false;
        if(!test){
            int s=peak;
            int e=arr.length-1;
            while(s<=e){
                int mid = s +(e-s)/2;
                if(arr[mid]>target){
                    e=mid-1;
                }else if(arr[mid]<target){
                    s=mid+1;
                }else{
                    return mid;
                }
            }
        } return -1;
    }
}
