import java.util.Arrays;

public class findN_2N {
    public static void main(String[] args) {
      int[] arr = {7,1,14,11};
        System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int s=0;//note that the s and e must be declared inside for loop
            int e=n-1;//when i++ happens it is a completely new BS
            int target = arr[i]*2;
            while(s<=e){
                int mid = s + ( e - s)/2;
                if(arr[mid]==target && mid!=i){
                    return true;
                } else if (arr[mid]>target){
                    e=mid-1;
                }else {
                    s=mid+1;
                }
            }

        }return false;
    }
}
//brute force approach
//    public boolean checkIfExist(int[] arr) {
//        int n = arr.length;
//        for(int i = 0; i < n;i++){
//            for(int j = 0 ; j < n ; j++){
//                if(i==j){
//                    continue;
//                }
//                if(arr[i]==2*arr[j]){
//                    return true;
//                }
//            }
//        }return false;
//    }