public class CountNumberOfHomogenousSubstrings {
    public static void main(String[] args) {
        String s = "abbcccaa";
//        Output: 13
//        Explanation: The homogenous substrings are listed as below:
//        "a"   appears 3 times.
//                "aa"  appears 1 time.
//                "b"   appears 2 times.
//                "bb"  appears 1 time.
//                "c"   appears 3 times.
//                "cc"  appears 2 times.
//                "ccc" appears 1 time.
//        3 + 1 + 2 + 1 + 3 + 2 + 1 = 13.
        System.out.println(countHomogenous(s));
    }
    public static int countHomogenous1(String s) {
        int i = 0 , j = 0, mod = 1000000007 ;
        int n = s.length();
        long count = 0;

        while( j < n){
            if(s.charAt(j) == s.charAt(i)){
                j++;
            }else{
                long len = j - i;
                count = (count + (len * (len + 1) / 2) % mod) % mod;
                i = j;
            }
        }
        long len = j - i;
        count = (count + (len * (len + 1) / 2) % mod) % mod;
        return (int)count;
    }
    public static int countHomogenous(String s) {
        int res = 0;
        int cur = 0;
        int count = 0;
        int mod = 1_000_000_007;
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == cur){
                count++;
            }else{
                count = 1;
            }
            cur = s.charAt(i);
            res = (res + count) % mod;
        }
        return res;
    }
}
