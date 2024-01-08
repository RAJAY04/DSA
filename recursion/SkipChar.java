public class SkipChar {
    public static void main(String[] args) {
        //skip all the a
        String str = "abcafgavhaart";
        System.out.println(skip(str));

    }

    private static String skip(String str) {
        if(str.length()==0){
            return "";
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            return skip(str.substring(1));
        }
        return ch + skip(str.substring(1));
    }
}
