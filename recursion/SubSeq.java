import java.util.ArrayList;
import java.util.List;
 public class SubSeq {
        public static void main(String[] args) {
            String s = "abc";
            subseqAscii("",s);
            subseq("",s);

            List<String> ans = subseqAsciiRet("",s);
            List<String> ans1 = subseq1("",s);

            System.out.println("second functions result below");
            System.out.println(ans);
        }

        static void subseq(String p, String up){
            if(up.length() == 0){
                System.out.println(p);
                return;
            }

            char ch = up.charAt(0);
            subseq(ch + p,up.substring(1));
            subseq(p,up.substring(1));
        }

        //the below function is the challenging one where u have to store the ans in the arraylist
        //without passing the arraylist in the function arguments

        static List<String> subseq1(String p, String up){
            if(up.length() == 0){
                List<String> ans = new ArrayList<>();
                ans.add(p);
                return ans;
            }

            char ch = up.charAt(0);
            List<String> left = subseq1(ch + p,up.substring(1));
            List<String> right = subseq1(p,up.substring(1));
            left.addAll(right);
            return left;
        }


        //return ascii is like
     //                     ""/ab
     //                a/b     97/b    ""/b
     static void subseqAscii(String p, String up){
         if(up.length() == 0){
             System.out.println(p);
             return;
         }

         char ch = up.charAt(0);
         subseqAscii(ch + p,up.substring(1));
         subseqAscii(p,up.substring(1));
         subseqAscii(p + (ch + 0),up.substring(1));
     }

     static List<String> subseqAsciiRet(String p, String up){
         if(up.length() == 0){
             List<String> ans = new ArrayList<>();
             ans.add(p);
             return ans;
         }

         char ch = up.charAt(0);
         List<String> first = subseqAsciiRet(ch + p,up.substring(1));
         List<String> second = subseqAsciiRet(p,up.substring(1));
         List<String> third = subseqAsciiRet(p + (ch + 0),up.substring(1));

         first.addAll(second);
         first.addAll(third);
         return first;
     }
    }


