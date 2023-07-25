import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        int n = 5;
//        Output: [0,1,1,2,1,2]
//        Explanation:
//        0 --> 0
//        1 --> 1
//        2 --> 10
//        3 --> 11
//        4 --> 100
//        5 --> 101
        System.out.println(Arrays.toString(countBits((n))));
        System.out.println(Arrays.toString(BrianKernigan(n)));
    }
    public static int[] countBits(int n) {
        int[] res = new int[n+1];
        res[0]=0;
        for (int i = 1; i <=n ; i++) {
            res[i]=res[i>>1]+(i&1);//if its a odd number it looses 1 bit which is at the right most
            //when we do i>>1; but it also compensates 1 that is lost in i&1 as it contains 1 at the end
            //if its even number , it doesnt even matter if we i>>1 as even number always have 0 in last
            //and the i&1 condition returns 0 as it has a zero in the end
            //the below does kind of same thing but is little confusing
//            if((i&1)==0){//case if its a even number
//                res[i]=res[i>>1];// same as res[i]=res[i/2];
//            }else{//case if the number is odd
//                res[i]=res[i-1]+1;
//            }
        }return res;
    }
    public static int[] BrianKernigan(int n){
        //this is the best solution ive written
        // note that the most effective way to solve this problem is DP
        int[] arr = new int[n+1];
        for (int i = 0; i <=n ; i++) {
            int temp =i;
            int count = 0;
            while(temp>0) {
                temp = temp & (temp - 1);
                count++;
                arr[i] = count;
            }
        }return arr;
    }
//    public static int[] countBits(int n) {
//        //this is my code and not that efficient
//        int[] arr = new int[n+1];
//        int num =0;
//        while(num<=n){
//            int count=0;
//            int i =num;
//            while(i>0){
//                count+= i&1;
//                i>>=1;
//            }arr[num]=count;
//            num++;
//        }return arr;
//    }
}
