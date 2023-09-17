package Arrays;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

        public static void sortColors(int[] nums) {
            //dutch national flag algorithm
            int low = 0, high = nums.length - 1, mid = 0; //we will use 3 pointers low , mid and high
            //low will point to the first element of the array
            //mid will point to the first element of the array
            //high will point to the last element of the array
            while (mid <= high) {
                //we will iterate the array till mid <= high
                if (nums[mid] == 0) {
                    //if nums[mid] == 0 we will swap nums[low] and nums[mid] and increment both low and mid
                    swap(nums, low, mid);
                    mid++;
                    low++;
                } else if (nums[mid] == 2) {
                    //if nums[mid] == 2 we will swap nums[high] and nums[mid] and decrement high
                    swap(nums, high, mid);
                    high--;
                } else {
                    //if nums[mid] == 1 we will increment mid
                    mid++;
                }
            }
        }

        public static void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

    public static void sortColors1(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) count0++;
            else if (nums[i] == 1) count1++;
            else count2++;
        }
        int i = 0;
        while (i < count0) {
            nums[i++] = 0;
        }
        while (i < count1 + count0) {
            nums[i++] = 1;
        }
        while (i < nums.length) {
            nums[i++] = 2;
        }

    }
}
