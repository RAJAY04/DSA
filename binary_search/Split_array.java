//we have to divde arrays into m subarrays such that the sum
// of the sub array is the lowest and return the lowest sum
public class Split_array {
    public static void main(String[] args) {
        int [] arr = { 7,2,5,10,8};
        int m = 2;
        System.out.println(split_arr(arr,2));
    }
    private static int split_arr(int[] arr, int m){
        int s=0;
        int e=0;
        for(int i =0;i<arr.length;i++) {
            s = Math.max(s, arr[i]);
            e += arr[i];
        }
            //int the end of the loop this will collect max and min possible values
            while(s < e){
                int mid = s+(e-s)/2;
                //calculate how many pieces you can divide this in with this max sum
                int sum = 0;
                int pieces =1;//min pieces is that array itself
                for (int num:arr){
                    if(sum+num >mid){
                        //which means you cannot add this in this array make a new array
                        //when u add num into a new subarray the sum = num;
                        sum=num;
                        pieces++;
                    }else{
                        sum+=num;
                    }
                    if(pieces>m){
                        s=mid+1;
                    }else{
                        e=mid;
                    }
                }
            }
        return e; //here start = end = mid
    }
}
