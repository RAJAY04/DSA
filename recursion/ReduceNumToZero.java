public class ReduceNumToZero {
    public static void main(String[] args) {
       int num = 14;
//        Output: 6
//        Explanation:
//        Step 1) 14 is even; divide by 2 and obtain 7.
//        Step 2) 7 is odd; subtract 1 and obtain 6.
//        Step 3) 6 is even; divide by 2 and obtain 3.
//        Step 4) 3 is odd; subtract 1 and obtain 2.
//        Step 5) 2 is even; divide by 2 and obtain 1.
//        Step 6) 1 is odd; subtract 1 and obtain 0.
        System.out.println(count(num,0));
    }
    public static int count(int num , int steps){
        if(num==0) return steps;
        if(num%2==0){
            return count(num/2,steps+1);
        }else return count(num-1,steps+1);
    }
}
