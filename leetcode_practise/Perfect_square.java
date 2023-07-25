public class Perfect_square {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(square(num));
    }

    private static boolean square(int num) {
        if(num==0||num==1){
            return true;
        }
        int s = 1;
        int e = num;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(mid==num/mid&&num%mid==0){
                return true;
            }else if(mid>num/mid){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }return false;
    }
}
