import java.util.Arrays;

public class StringReverse {
    public static void main(String[] args) {
        char[] s ={'h','e','l','l','o','o'};
        char[] output =ans(s,0,s.length-1);
        System.out.println(Arrays.toString(output));

    }
    public static char[] ans(char[] s, int beg, int end){
        if(beg>end){
            return s;
        }//base condition
        char temp;//swap occurs
        temp=s[beg];
        s[beg]=s[end];
        s[end]=temp;
        return ans(s,beg+1,end-1);
    }
}
