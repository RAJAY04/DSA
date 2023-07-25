public class MaximaiseTheConfusion {
    public static void main(String[] args) {
        String answerKey = "TTFTTFTT";
        int k = 1;
//        Explanation: We can replace both the 'F's with 'T's to make answerKey = "TTTT".
//                There are four consecutive 'T's.
        System.out.println(maxConsecutiveAnswers(answerKey,k));
    }
    // note that this problem uses a sliding window approach
    public static int maxConsecutiveAnswers(String answerKey, int k) {
        int count =0;
        int ans =0;
        int left = 0;
        for (int right= 0; right < answerKey.length() ; right++) {
            if(answerKey.charAt(right)== 'T'){//checking for F , here T is replacement
                count++;
            }while(count > k){
                if(answerKey.charAt(left)=='T'){
                    count--;
                } left++;
            }
            ans = Math.max(right- left +1,ans);
        }
        count=0;
        left=0;
        for (int right = 0; right < answerKey.length(); right++) {
                if( answerKey.charAt(right)=='F'){//this step if a check for T , F is unwanted and replacment here
                    count++;
                }while(count>k){
                    if(answerKey.charAt(left)=='F'){
                        count--;
                    }left++;
            }
                ans = Math.max(right-left+1,ans);
        }return ans;
    }
}
