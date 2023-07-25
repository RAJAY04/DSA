import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));

    }
    public static int lengthOfLastWord(String s) {
        int letter =  0;
        for (int i = s.length()-1; i >=0 ; i--) {
            if(s.charAt(i)!= ' '){
             letter++;
            }else{
                if(letter>0){
                    return letter;
                }
            }
        }
        return letter;
    }
}
