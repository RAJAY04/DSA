import java.util.Arrays;

public class CheckPrime {
    //this is the seive of erathonisis problem
    public static void main(String[] args) {
        int n = 15;
        //Output: 4
        System.out.println(countPrimes(n));
    }


        public int countPrimes1(int n) {//this is optimised
            boolean[] seen = new boolean[n];
            int ans = 0;
            for (int num = 2; num < n; num++) {
                if (seen[num]) {
                    continue;
                }
                ans += 1;//increment the ans
                for ( int mult = num * num; mult < n; mult += num){//mark multiples as false
                    seen[mult] = true;//num * num avoids marking numbers which have already been marked
                }
            }
            return ans;
    }
    public static int countPrimes(int n) {
        if(n<2){
            return 0 ;
        }
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr,true);
        //creating a boolean array that by default contains all false hence make it true by fill
        arr[0] = false;
        arr[1] = false;
        for(int i = 2; i*i <=n ; i++){// only check till i<= sqrt(n) hence we square on both sides to
                for( int j = i * 2 ; j <= n ; j += i){//i*2 bcz multiples of i we are setting as true
                    arr[j] = false;//here false means not prime
                }
        }
        int count = 0;
        for(int i = 0 ; i < n ; i++){//dont consider last ele as it starts from 0
            //we can start from 0 as we have already set 0 and 1 th ele as fasle
            if(arr[i]){//if any ele is left as false it means that its prime
                count++;
            }
        }
        return count;
    }
}
