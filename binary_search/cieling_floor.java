public class cieling_floor {
    public static void main(String[] args) {
        int [] arr = { 1,2,3,4,6,10,16,25};
//        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int target = 14;
        int ans1 = cieling(arr, target);
        int ans2 = floor(arr, target);
        System.out.println("the cieling of the number is " + ans1);
        System.out.println("the floor of the number is " + ans2);
    }

    private static int cieling(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        boolean isasc = arr[s] < arr[e];
        if (isasc) {
            while (s <= e) {
                int m = s + (e - s) / 2;
                if (target > arr[m]) {
                    s = m + 1;
                } else if (target < arr[m]) {
                    e = m - 1;
                } else {
                    return arr[m];
                }
            }
        } else {
            while (s <= e) {
                int m = s + (e - s) / 2;
                if (target < arr[m]) {
                    s = m + 1;
                } else if (target > arr[m]) {
                    e = m - 1;
                } else {
                    return arr[m];
                }
            }
        }
        return arr[s];
    }

    private static int floor(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        boolean isasc = arr[s] < arr[e];
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isasc) {
                if (arr[mid] > target) {
                    e = mid - 1;
                } else if (arr[mid] < target) {
                    s = mid + 1;
                } else {
                    return arr[mid];
                }
            } else {
                if (arr[mid] < target) {
                    e = mid - 1;
                } else if (arr[mid] > target) {
                    s = mid + 1;
                } else {
                    return arr[mid];
                }
            }
        }return arr[e];
    }
}

