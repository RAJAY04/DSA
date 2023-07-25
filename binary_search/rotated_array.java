public class rotated_array {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        int target = 4;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target) {
        int pivot = find_pivot_with_duplicates(nums);
        if (pivot == -1) {
            return bs(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return bs(nums, target, 0, pivot - 1);
        }
        return bs(nums, target, pivot + 1, nums.length - 1);

    }


    static int bs(int[] nums, int target, int s, int e) {

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] < target) {
                s = mid + 1;
            } else if (nums[mid] > target) {
                e = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int find_pivot(int[] arr) {//this will not work for duplicate values
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid < e && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > s && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[s] > arr[mid]) {//not arr[s]>=arr[mid]
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }

    static int find_pivot_with_duplicates(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid < e && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (s < mid && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[s] == arr[mid] && arr[mid] == arr[e]) {
// skip the duplicates, but what if the elements at s and e were
// pivots ?, so check that first
                if (arr[s] > arr[s + 1]) {
                    return s;
                }
                s++;
                if (arr[e] < arr[e - 1]) {
                    return e - 1;
                }
                e--;
            }//now the left side is sorted , so pivot should be at right
            else if (arr[s]<arr[mid] || (arr[s]==arr[mid]&&arr[mid]>arr[e])) {
            s=mid+1;
            }else{
                e=mid-1;
            }
        }return -1;
    }
}
