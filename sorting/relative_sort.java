import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class relative_sort {
    public static void main(String[] args) {
       int [] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
       int []arr2 = {2,1,4,3,9,6};
//        Output: [2,2,2,1,4,3,3,9,6,7,19]
        System.out.println(Arrays.toString(relativeSortArray(arr1,arr2)));
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        //using count sort
        int[] cnt = new int[1001];
        for(int n : arr1) cnt[n]++;
        int i = 0;
        for(int n : arr2) {
            while(cnt[n]-- > 0) {
                arr1[i++] = n;
            }
        }
        for(int n = 0; n < cnt.length; n++) {
            while(cnt[n]-- > 0) {
                arr1[i++] = n;
            }
        }
        return arr1;
    }
//    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
//         int o = 0;
//         int[] output = new int[arr1.length];
//         boolean absent;
//        for (int i = 0; i < arr2.length; i++) {
//            for (int j = 0; j < arr1.length; j++) {
//                if(arr2[i]==arr1[j]){
//                    output[o++]=arr1[j];//o++ is actual value , ++o is incremented value
//                }
//            }
//        }
//        //until here the code just helps in sorting things only for the elements that are present in arr2
//        ArrayList <Integer> missing = new ArrayList<>(5);
//        for (int i = 0; i < arr1.length; i++) {
//            absent = true;
//            for (int j = 0; j < arr2.length; j++) {
//                if(arr2[j]==arr1[i]){
//                    absent=false;
//                    break;
//                }
//            }if(absent){
//                missing.add(arr1[i]);
//            }
//        }//until here we have stored the missing numbers in another arraylist
//        Collections.sort(missing);//this is how we sort the array list
//        o =0;
//        int len = output.length;
//        //the below loop is used to concatenate list and a array list
//        for (int i = 0; i < missing.size(); i++) {
//            output[len+o-missing.size()]=missing.get(i);
//            o++;
//        }
//        return output;
//    }
}
