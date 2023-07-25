public class BinarySearchSQRT_L {
    public static void main(String[] args) {
        int n = 40;
        int precesion=3;
        System.out.println(sqrt(n,precesion));
    }

    private static double sqrt(int n, int precesion) {
        int start = 0;
        int end = n;
        double root = 0.0;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(mid*mid==n) {
                return mid;
            }
            if(mid*mid>n){
                end=mid-1;
            }
            else{
                start=mid+1;
            }root=end;
            }
        double increment = 0.1;
        for (int i = 0; i < precesion; i++) {
            while(root*root<=n){
                 root+=increment;
        }
            root-=increment;
            increment/=10;
        }return root;
    }

}
