public class NumberComplement {
    public static void main(String[] args) {
        int num =5;
        System.out.println(findComplement(num));
        System.out.println(findComplement2(num));
//        Output: 2
//        Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
    }
    public static int findComplement(int num) {
        //approach is eg 5 = 101 , then ~5 = 111^101
        int temp = num;
        int ans =0;
        int i =0;
        while(num>0){
            ans+=Math.pow(2,i);
            i++;
            num>>=1;
        }return ans^temp;
    }
    public static int findComplement2(int num) {
        //approach is eg 5 = 101 , then ~5 = 111^101
        int temp = num;
        int count=0;
        while(num>0){
            num>>=1;
            count++;
        }int mask = (1<<count)-1;//eg 1<<3 gives 1000 to make it 111 we subtract 1;
        return temp^mask;
    }
}
