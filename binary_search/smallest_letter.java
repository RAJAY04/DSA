//here the letters wrap around, hence if we search the the last ele
//after running binary search the start would be greater than the end when the
//loop breaks , hence  start % length of the array would return 0 hence moving on to first ele
public class smallest_letter {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','d'};
        char target = 'd';
        char ans = sol(arr,target);
        System.out.println(ans);
    }

    private static char sol(char[] arr, char target) {
        int s = 0;
        int e = arr.length - 1;
            while (s<=e){
                int m = s+(e-s)/2;
                if (target < arr[m]){
                    e=m-1;
                }else{
                s=m+1;
                }
            }return arr[  s%arr.length ];
    }
}
