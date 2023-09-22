public class IsSubsequence {
    public static void main(String[] args) {
        String s = "axc", t = "ahbgdc";
//        Output: false
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        int n=t.length();
        int m=s.length();
        char ss[]=s.toCharArray();
        char tt[]=t.toCharArray();

        if(m<1)
            return true;

        while(i<n){
            if(tt[i]==ss[j]){
                j++;
            }
            i++;

            if(j==m)
                return true;
        }

        return false;
    }
}
