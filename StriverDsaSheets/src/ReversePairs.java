public class ReversePairs {
    public static void main(String[] args) {
        int[] nums = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        System.out.println(reversePairs(nums));
    }

    public static int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }

    public static int mergeSort(int[] nums , int low , int high){
        int cnt = 0;
        if(low >= high){
            return cnt;
        }
        int mid = low + (high - low)/2;
        cnt += mergeSort(nums,low,mid);
        cnt += mergeSort(nums,mid+1,high);
        cnt += countPairs(nums,low,mid,high);
        merge(nums,low,mid,high);
        return cnt;
    }


    public static int countPairs(int[] nums,int low , int mid , int high){
        int right = mid + 1;
        int cnt = 0;
        for (int i = low; i <= mid; i++) {
            while(right <= high && nums[i] > (double) 2 * nums[right])right++;
            cnt += (right - (mid + 1));
        }
        return cnt;
    }

    public static void merge(int[] nums,int low , int mid , int high){
        int[] arr = new int[high - low + 1];
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr
        int i = 0;
        //storitng elements in a temp array in a sorted manner
        while(left <= mid && right <= high){
            arr[i++] = nums[left] <= nums[right] ? nums[left++] : nums[right++];
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            arr[i++] = nums[left++];
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            arr[i++] = nums[right++];
        }

        // transfering all elements from temporary to arr //
        for (i = low; i <= high; i++) {
            nums[i] = arr[i - low];
        }
    }
    public static int reversePairs1(int[] nums) {
        //this is a brute force solution
        int n = nums.length;
        // Count the number of pairs:
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > 2 * nums[j])
                    cnt++;
            }
        }
        return cnt;
    }
}
