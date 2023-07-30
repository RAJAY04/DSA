import java.util.Arrays;

public class EmployeMetTarget {
    public static void main(String[] args) {
        int[] hours = {1,4,6,99,66,77,56};
        int target =57;
        System.out.println(numberOfEmployeesWhoMetTarget(hours,target));
//        Output: 3
//        Explanation: The company wants each employee to work for at least 2 hours.
//                - Employee 0 worked for 0 hours and didn't meet the target.
//                - Employee 1 worked for 1 hours and didn't meet the target.
//                - Employee 2 worked for 2 hours and met the target.
//                - Employee 3 worked for 3 hours and met the target.
//                - Employee 4 worked for 4 hours and met the target.
//                There are 3 employees who met the target.
    }
    //better to use bruteforce and run a single for loop to get O(N) complexity , as the array is not sorted
    //else it would take bad complexity just to sort the array

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target){
        int count = 0;
        for (int i = 0; i < hours.length; i++) {
            if(hours[i]>=target){
                count++;
            }
        }return count;
    }
    public static int numberOfEmployeesWhoMetTarget1(int[] hours, int target) {
        Arrays.sort(hours);//sort the array to use binary search
        int s = 0;
        int e = hours.length-1;
        while( s <= e ){
            int mid = s + ( e - s )/2;
            //if target hours greater than shift start to right
            if( hours[mid] < target){
                s = mid + 1;
                //if target hours less or equal to mid it means that there may be more probable answer leftside
                //hence shift the end to left side
            }else{
                e=mid-1;
            }
            //in the end start will be greater than end hence loop breaks
        }return hours.length-s;
    }

}
