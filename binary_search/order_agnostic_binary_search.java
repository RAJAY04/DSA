public class order_agnostic_binary_search {
    public static void main(String[] args) {
//        int [] arr = { 1,2,3,4,5,6,7,9};
        int [] arr = { 9,8,7,6,5,4,3,2,1};
        int target = 7;
        int ans = oabs(arr,target);
        System.out.println(ans);
    }
    private static int oabs(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        boolean isasc = arr[s]<arr[e];
        if ( isasc){
            while ( s<=e){
                int m = s+(e-s)/2;
                if (target > arr[m]){
                    s=m+1;
                } else if (target<arr[m]) {
                    e=m-1;
                }else{
                    return m;
                }
            }
        }else{
            while ( s<=e){
                int m = s+(e-s)/2;
                if (target<arr[m]){
                    s=m+1;
                } else if (target>arr[m]) {
                    e=m-1;
                }else{
                    return m;
                }
            }
        }return -1;
    }
}
