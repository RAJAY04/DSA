public class IsPrime_L {
    public static void main(String[] args) {
        int num =20;
            boolean[] arr= new boolean[num+1];//note that boolean arr contains all false in the begining
            OptimisedIsPrime(num,arr);
        }
    private static void OptimisedIsPrime(int n , boolean[] arr){
        for (int i = 2; i*i<=n; i++) {
            if(!arr[i]){
                for (int j = i*2; j <= n ; j+=i) {
                    arr[j]=true;
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            if(!arr[i]) System.out.println(i+" ");
        }
    }

    private static boolean ISprime(int num) {
        if ( num <=1)return false;
        int check = 2;
        while(check * check <= num){//to avoid repeating of the case ( 2*4 =8 is same as 4*2=8 )
            //this is same as check<=sqrt(num)
            if(num % check==0)return false;
            check++;
        }
        return true;
    }
}
