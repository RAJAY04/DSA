public class KthMissingPositive {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8};
        int k = 5;
        System.out.println(findKthPositive(arr,k));
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

