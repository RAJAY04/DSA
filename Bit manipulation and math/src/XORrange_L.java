public class XORrange_L {
    public static void main(String[] args) {
// to find XOR of a->b
        int a =3;
        int b=9;
        int ans = xor(b)^xor(a-1);
        System.out.println(ans);
        int ans2=0;
        //this is only for check , will give time limit exceed for large numbers
        for (int i = a; i <= b; i++) {
            ans2^=i;
        }
        System.out.println(ans2);
    }
    //this gives XOR from 0->a
    private static int xor(int a){
        if(a%4==0)return a;
        if(a%4==1)return 1;
        if(a%4==2)return a+1;
        return 0;
    }
}
