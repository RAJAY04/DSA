import java.util.Arrays;
import java.util.Comparator;

public class SortIntegersByNumberOfOneBits {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
//        Output: [0,1,2,4,8,3,5,6,7]
//        Explantion: [0] is the only integer with 0 bits.
//[1,2,4,8] all have 1 bit.
//[3,5,6] have 2 bits.
//[7] has 3 bits.
//                The sorted array by bits is [0,1,2,4,8,3,5,6,7]

        System.out.println(Arrays.toString(sortByBits(arr)));
    }
    public static int[] sortByBits(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] += countBits(arr[i]) * 10001;
        }
        Arrays.sort(arr);
        for(int i = 0 ; i < n; i++){
            arr[i] %= 10001;
        }
        return arr;
    }
    public static int countBits(int num){
        int count = 0;
        if(num == 0)return 0;
        else{
            while(num != 0){
                num = num & (num - 1);
                count++;
            }
        }return count;
    }
}

