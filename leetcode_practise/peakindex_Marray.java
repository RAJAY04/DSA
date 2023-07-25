public class peakindex_Marray {
    public static void main(String[] args) {
        int [] arr = {24,69,100,99,79,78,67,36,26,19};
        System.out.println( peakIndexInMountainArray(arr));
    }

    private static int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}
