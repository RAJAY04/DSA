import java.util.ArrayList;
import java.util.List;

public class PhonePad {
    public static void main(String[] args) {
//        System.out.println(pad("","12"));
        System.out.println(pad("","12"));
    }

//    static void pad(String p,String up){
//        if(up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//        int digit = up.charAt(0) - '0';
//
//        for(int i = (digit - 1) * 3 ; i < digit * 3; i++){
//            char ch = (char) ('a' + i);
//            pad(p+ch,up.substring(1));
//        }
//    }
//    static List<String> pad(String p, String up){
//        if(up.length() == 0){
//            List<String> ans = new ArrayList<>();
//            ans.add(p);
//            return ans;
//        }
//
//        int digit = up.charAt(0) - '0';
//
//        List<String> ans = new ArrayList<>();
//
//        for(int i = (digit - 1) * 3 ; i < digit * 3; i++){
//            char ch = (char) ('a' + i);
//            ans.addAll(pad(p+ch,up.substring(1)));
//        }
//        return ans;
//    }


        static int pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return 1;
        }
        int digit = up.charAt(0) - '0';
        int count = 0;
        for(int i = (digit - 1) * 3 ; i < digit * 3; i++){
            char ch = (char) ('a' + i);
           count += pad(p+ch,up.substring(1));
        }
        return count;
    }
}


