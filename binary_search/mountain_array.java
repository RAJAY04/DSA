//it is like running a binary search without having a target
//simple approach , when we run binary search we check two consecutive eles and if the first ele is greater than the
//next it means that we are in the decreasing part of the arry , hence there could be a greater
//number before the mid.vice versa for the increasing part
public class mountain_array {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6 ,7,8, 4 , 3 , 1};
        int ans = ans(arr);
        System.out.println(ans);
    }

    private static int ans(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while( start < end ){
            int mid = start + ( end - start)/2;
            if( arr[mid] > arr[ mid +1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }return start;
    }
}
