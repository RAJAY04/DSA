import java.util.Arrays;

public class SelectionSort_L {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        selectionSort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort( int[] arr, int r , int c, int max_index){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[max_index]){
                selectionSort(arr,r,c+1,c);
            }else{
                selectionSort(arr,r,c+1,max_index);
            }
        }else{
            //now it has traversed and found the max index and now we can swap
            int temp = arr[max_index];
            arr[max_index] = arr[r-1];
            arr[r-1] = temp;
            //now when we have swapped we move on to the fresh iteration
            selectionSort(arr,r-1,0,0);
        }
    }

}
