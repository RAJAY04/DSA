public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "()[{]}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        //index of method returns -1 if the specified character is not found
        while (s.indexOf("{}") !=-1 || s.indexOf("[]") !=-1 || s.indexOf("()") !=-1 ){
            s=s.replace("()","");
            s=s.replace("[]","");
            s=s.replace("{}","");
        }
        return s.isEmpty();
    }
}
//only works if the brackets open and close contineously
// for (int i = 0; i < s.length()-1; i=i+2) {
//        if(s.charAt(i)=='('){
//        if(s.charAt(i+1)!=')'){
//        return false;
//        }
//        } else if (s.charAt(i)=='[') {
//        if(s.charAt(i+1)!=']'){
//        return false;
//        }
//        }else{
//        if(s.charAt(i)!='{' || s.charAt(i+1)!='}'){
//        return false;
//        }
//        }
//        }return true;