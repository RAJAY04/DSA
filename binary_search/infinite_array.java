// this is a bs problem where start and end is not there,approach is
//in the begening we consider a small chunk of array and go on to the end by doubling the chunk
//until the target element is greater than the end element of the latest chunk

//nice question ,  returning a function inside other function makes the code easy to break down
public class infinite_array {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 14, 16, 116};
        int target = 14;
        int ans = ans(arr,target);
        System.out.println(ans);
    }

    private static int ans(int[] arr, int target) {
        int s = 0;
        int e = 1;
        while (target > arr[e]) {
            int temp = e + 1;
            //end = old end + length of new box * 2;
            e = e + (e - s + 1) * 2;
            s = temp;
        }
        return binsearch(arr, target, s, e);
    }

    private static int binsearch(int[] arr, int target, int s, int e) {
        boolean isasc = arr[s] < arr[e];
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (target > arr[m]) {
                s = m + 1;
            } else if (target < arr[m]) {
                e = m - 1;
            } else {
                return m;
            }
        }return -1;
    }
}
