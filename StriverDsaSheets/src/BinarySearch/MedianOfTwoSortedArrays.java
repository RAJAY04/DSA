package BinarySearch;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,3,4,6,15}, nums2 = {2,3,7,10,12};
//        Output: 2.00000
//        Explanation: merged array = [1,2,3] and median is 2.
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }

//this is the most optimal code O(logMin(n1,n2)) and O(1)
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length , n2 = nums2.length;
        if ( n1 > n2) return findMedianSortedArrays(nums2,nums1);

        int n = n1 + n2 ,left = (n1 + n2 + 1)/2;
        int low = 0 , high = n1;//in bs we are finding how many elements from nums1 should
        // be in left half hence the maximum elements that can be in left half is n1

        while( low <= high){
            int mid1 = low + (high - low)/2;
            int mid2 = left - mid1;

            int l1 = mid1 > 0 ? nums1[mid1 - 1] : Integer.MIN_VALUE;//if mid1 == 0 then
            // there is no element in left half of nums1 hence we take MIN_VALUE
            int l2 = mid2 > 0 ? nums2[mid2 - 1] : Integer.MIN_VALUE;//if mid2 == 0 then there is
            // no element in left half of nums2 hence we take MIN_VALUE
            int r1 = mid1 < n1 ? nums1[mid1] : Integer.MAX_VALUE;//if mid1 == n1 then there is no
            // element in right half of nums1 hence we take MAX_VALUE
            int r2 = mid2 < n2 ? nums2[mid2] : Integer.MAX_VALUE;//if mid2 == n2 then there is
            // no element in right half of nums2 hence we take MAX_VALUE

            if(l1 <= r2 && l2 <= r1) {
                if (n % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                } else {
                    return Math.max(l1, l2);
                }
            }else if(l1 > r2) {
                high = mid1 - 1;
            }else{
                low = mid1 + 1;
                }
        }
        return 0;//dummy value
    }


    //given below is a better version of the brute force solution which takes O(1) space
    public static double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int n = n1 + n2;
        int i = 0, j = 0, idx1 = n / 2, idx2 = idx1 - 1, cnt = 0, idx1_ele = -1, idx2_ele = -1;
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                if (cnt == idx1) idx1_ele = nums1[i];
                if (cnt == idx2) idx2_ele = nums1[i];
                cnt++;
                i++;
            } else {
                if (cnt == idx1) idx1_ele = nums2[j];
                if (cnt == idx2) idx2_ele = nums2[j];
                cnt++;
                j++;
            }
        }
            while (i < n1) {
                if (cnt == idx1) idx1_ele = nums1[i];
                if (cnt == idx2) idx2_ele = nums1[i];
                cnt++;
                i++;
            }
            while (j < n2) {
                if (cnt == idx1) idx1_ele = nums2[j];
                if (cnt == idx2) idx2_ele = nums2[j];
                cnt++;
                j++;
            }
            if (n % 2 == 0) return (idx1_ele + idx2_ele )/ 2.0;
            else return idx1_ele;
        }


        //given below is a extreme brute force solution which takes lot of extra space
    public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        double[] mergedArray = mergeArrays(nums1, nums2);

        if(mergedArray.length % 2 == 0) {
            // even length, return average of middle two elements
            return (mergedArray[mergedArray.length/2] + mergedArray[mergedArray.length/2 - 1]) / 2;
        } else {
            // odd length, return the middle element
            return mergedArray[mergedArray.length/2];
        }
    }

    public static double[] mergeArrays(int[] nums1, int[] nums2) {

        double[] merged = new double[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < nums1.length && j < nums2.length) {
            //remember to use && and not || , as it will give index out of bound or wrong merging
            //when any one of the array is completely traversed we just stop the loop and append
            //remaining elements in the below while loop
            if(nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        // add remaining elements from nums1
        while(i < nums1.length) {
            merged[k++] = nums1[i++];
        }

        // add remaining elements from nums2
        while(j < nums2.length) {
            merged[k++] = nums2[j++];
        }

        return merged;
    }


}
