import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
      merge(nums1,m,nums2,n);
//        Output: [1,2,2,3,5,6]
//        Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//        The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
    }
    //two pointer approach
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;//points to end of ele of nums1
        int j = n - 1;//points to end of nums2
        int k = m + n - 1;//points to end of nums1

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        for( int i = 0; i < n; i++){
            nums1[m+i]=nums2[i];
            }
        Arrays.sort(nums1);
        }//Sc O(n)//for loop + O((m+n) * log(m+n))//due to sort->overall O((m+n) * log(m+n))
}
