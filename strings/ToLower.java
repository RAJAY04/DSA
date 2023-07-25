public class ToLower {
    public static void main(String[] args) {
        String s = "Hello@[]";
//        Output: "hello";
        System.out.println(toLowerCase(s));
    }
//    A-Z->65-90
//    a-z->97-122
    public static String toLowerCase(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>=56 && s.charAt(i)<=90){//if its caps turn into small
                ans.append((char)(s.charAt(i)+32));
            }else{//is not caps then append as it is
                ans.append(s.charAt(i));
            }
        }return ans.toString();// to convert stringbuilder into a string to match the return type
    }
}
