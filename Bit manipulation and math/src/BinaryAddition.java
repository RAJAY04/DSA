public class BinaryAddition {//most repeated qn in facebook
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
//        Output: "10101"
        System.out.println(addBinary(a,b));
    }

    public static String addBinary(String a, String b) {
        int i=a.length()-1,j=b.length()-1,carry=0;
        StringBuilder res = new StringBuilder();
        while(i>=0||j>=0){
            int sum = carry;//if in the pevious iteration we had a carry , then we are passing that to sum
            if(i>=0)sum+=a.charAt(i--)-'0';//value of 0 if 48 in ascii hence ensures to convert to proper values
            if(j>=0)sum+=b.charAt(j--)-'0';
            carry = sum>1?1:0;//generate carry
            res.append(sum%2);//if in case sum is 2 , it appends 0 ,carry is already generated in previous case
        }if(carry!=0)res.append(carry);
        return res.reverse().toString();
    }
}
