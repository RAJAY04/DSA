public class IsUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,5,4,5,2,3};
        System.out.println(unique(arr));
    }
    //when we xor the number with samw number it cancels out each other and hence the number thats unique only remains
    private static int unique(int[] arr) {
        int unique =0;
        //any ele^0 gives the same element
        for (int n:arr) {
            unique^=n;
            //any ele^ele gives 0
        }return unique;
    }
}
