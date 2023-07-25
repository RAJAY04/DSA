public class SQRTnewtonRephson_L {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }
    static double sqrt(double n){
        double x = n;
        double root;
        while(true){
             root = 0.5 * (x+(n/x));
            if(Math.abs(root-x)<1){//here the 1 is the error allowed in the ans , decrease that if you want more precise answer
                break;//this is the loop breaking condition
            }
            x= root;//if loop dosent break , assign the value of the root to x(our assumed root)
        }return root;
    }

}
