public class KthMissingPositive {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8};
        int k = 5;
        System.out.println(findKthPositive(arr,k));
    }
    public static int findKthPositive3(int[] arr, int k) {
        int low = 0 ,n = arr.length, high = n -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            int missing = (arr[mid] - (mid + 1));
            if( missing < k){//wrong ans if missing <= k
                //The key thing is that missing represents the number of positive integers missing up
                // to index mid.
                //We want to find the index where the number of missing positive integers is >= k.
                //So we should check missing >= k rather than missing < k. This is because as soon as missing
                // becomes >= k, we know the index low is the answer.
                //If we checked for missing < k, we would skip over the index we want.
                //So by changing the condition to missing >= k, we can correctly find the index
                // low where the number of missing positives is at least k.
                low = mid+1;
            }else{
                high = mid -1;
            }
        }return high + 1 + k;
    }
    public int findKthPositive1(int[] arr, int k) {
        for(int i : arr){//very nice solution
            if(i <= k) k++; else break;
        }
        return k;
    }

        public int findKthPositive2(int[] arr, int k) {
            int left = 0, right = arr.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] - mid - 1 < k) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }//very complex derivation see notes
            return left + k;
        }

    public static int findKthPositive(int[] arr, int k) {
        int num = 0;
        int index = 0;
        while(k > 0 && index < arr.length){
            if(num+1 != arr[index]){
                    num++;
                    k--;
                }
            else{
                index++;
                num++;
            }

        }
        if( k == 0){
            return num;
        }
            while(k > 0 && num >= arr[arr.length-1]){
                num++;
                k--;
            }return num;
        }
    }

