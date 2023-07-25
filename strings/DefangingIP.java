public class DefangingIP {
    public static void main(String[] args) {
        String address = "1.1.1.1";
//        Output: "1[.]1[.]1[.]1"
        System.out.println(defangIPaddr(address));
    }
    public static String defangIPaddr(String address) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if(address.charAt(i)=='.'){
                ans.append("[.]");
            }else{
                ans.append(address.charAt(i));
            }
        }return ans.toString();
    }
}
