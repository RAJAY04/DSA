public class KthSymbolInGrammer {
    public static void main(String[] args) {
        int n = 1, k = 3;
//        Output: 0
//        Explanation:
//        row 1: 0
        System.out.println(kthGrammar(n,k));
    }
    public static int kthGrammar(int n, int k) {
        int low = 1, high = (int)Math.pow(2,n -1);//1 << (n - 1)way to find power of 2
        int ans = 0;
        while(low <= high){
            int mid = (low + high)/2;
            if(k <= mid){
                high = mid - 1;
            }else{
                low = mid+1;
                ans ^= 1;
            }
        }return ans;
        //Approach
        //The basic idea is to start with two pointers i.e. l=1 and r=(2^(n-1)).
        // Then check if k lies on the left part of the partition or on the right.
        // If k is on the left, you do not need to take the complement as the answer
        // will remain the same. If it is on the right, then you need to take the complement,
        // as the right string is the mirror image of the left string for n-1 value. The steps are:
        //Take two pointers l=1 and r=(2^(n-1)) and an answer variable initialized with 0.
        //Calculate the middle as mid=(l+r)/2.
        //If k<=mid (k is on the left side of the partition), keep the answer as it is,
        // and change the value of r to mid to check for the left half.
        //If k>mid (k is on the right side of the partition), change the answer by taking
        // the complement of the answer and change the value of l to mid+1 to check for the
        // right half.
        //Finally, return the answer.
        //Complexity
        //Time complexity: O(n) - Because you are doing binary search on 2^(n-1) and thus
        // log2(2^(n-1)) = n-1, making the time complexity O(n).
        //Space complexity: O(1) - Because no extra space is used.
    }
}
