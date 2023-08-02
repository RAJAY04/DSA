import java.util.ArrayList;
import java.util.List;

public class Find_L {
    public static void main(String[] args) {
        int[] arr = { 1,4,7,9,7,4,3};
        int target = 7;
        ArrayList<Integer> ans = new ArrayList<>();
        System.out.println(search_indices2(arr,target,0));
    }
    //if there are multiple same elements then if you want the function to return all the indices then
    // create a array list outside the function and add the index when element is found
//    static List<Integer> ans = new ArrayList<>();
//    public static void search_indices( int[] arr, int target, int index){
//        if( index == arr.length){
//            return;
//        }
//        if(arr[index] == target) {
//           ans.add(index);
//        }
//        search_indices(arr,target,index+1);
//    }
    //now if we dont want to create a list externally?
    public static ArrayList<Integer> search_indices( int[] arr, int target, int index, ArrayList<Integer> ans){
        if( index == arr.length){
            return ans;
        }
        if(arr[index] == target) {
            ans.add(index);
        }
        return search_indices(arr,target,index+1,ans);//this is the most preferred approach
    }

    public static ArrayList<Integer> search_indices2( int[] arr, int target, int index){
        //solving using declaring list inside the function call , due to this new list will be created
        //in every function call and its value is only available inside that function hence dont
        //use this approach as it uses a lot of memory use the above approach
        ArrayList<Integer> ans = new ArrayList<>();
        if( index == arr.length){
            return ans;
        }
        //this will contain the answer for that function call only
        if(arr[index] == target) {
            ans.add(index);
        }
        ArrayList<Integer> AnswersFromBelow = search_indices2(arr,target,index+1);
        ans.addAll(AnswersFromBelow);
        return ans;
    }



    public static boolean search( int[] arr, int target, int index){
        if( index == arr.length){
            return false;
        }
        return arr[index] == target || search(arr,target,index+1);
    }



    public static int search_index( int[] arr, int target, int index){
        if( index == arr.length){
            return -1;
        }
        if(arr[index] == target) {
            return index;
        }
        return search_index(arr,target,index+1);
    }
}
