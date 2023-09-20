public class MinimumOperationToReduceXToZero {
    public static void main(String[] args) {
       int[] nums = {3,2,20,1,1,3};
       int x = 10;
//        Output: 5
//        Explanation: The optimal solution is to remove the last three elements and the
//        first two elements (5 operations in total) to reduce x to zero.
        System.out.println(minOperations(nums,x));
    }
    //we are thinking the question in different way, we can see that whenever we remove an left
    //most or right most arr element it strinks the array , hence we try to find the largest
    //subarray in between with sum , total_ele_sum - x; which means the sum of rest elements except
    //the subarray must result in x as the ans.
    //TC = O(n) and SC = O(1)
    public static int minOperations(int[] nums, int x) {
        int n = nums.length;
        int sum = 0;
        for (int k = 0; k < n; k++) {
            sum += nums[k];
        }
        int cur_sum = 0 ,max_length = -1 , left = 0 , right = 0;
        while( right < n){
            cur_sum += nums[right];
            while(cur_sum > sum - x && left <= right){
                cur_sum -= nums[left++];
            }
            if(cur_sum == sum - x){
                max_length = Math.max(max_length , right - left + 1);
            }
            right++;
            //increment the right at the end because if you do cur_sum += nums[right++]
            // Math.max(max_length , right - left + 1);this will give different answer
            //because we increment the value of right before itself
        }
        return max_length == -1 ? -1 : n - max_length;
    }
}

//Logic
//Initially, this question might look like a DP problem: pick either left or right recursively and collect the number of operations along the way. A brute force approach would result in an O(2^n) complexity which isn't great. Memoization would improve this but we'll exceed the memory limit as I've tested. Besides, we can do better.
//
//By simply reframing the question, we can come up with an O(n) complexity solution. The difficulty in this question arises from deciding whether to choose the left or the right element to remove at any given point. However, while we're removing elements from the array, we're definitely going to be letting some elements remain as well. In particular, the middle elements.
//
//Key observation:
//
//The number of elements removed equals n minus the number of elements that aren't removed.
//
//Therefore, to find the minimum number of elements to remove, we can find the maximum number of elements to not remove!
//
//So, instead of trying to find the minimum number of operations, why don't we focus on finding the longest subarray in the middle. One main thing to note is that our subarray should sum to sum - x (where sum is the sum of all elements in our array).
//Why? because the middle elements are technically the ones we don't want. If the sum of the outer elements equals x, then we're looking for a middle sum of sum - x. If this doesn't quite make sense, pay attention to the below diagram with nums = [1,5,3,9,1,7,1,3], x = 12:
//image(Keep in mind that this approach only works due to the absence of negative numbers!)
//
//Finding our max middle subarray length:
//We can find this using a two-pointer / sliding window approach. Start left and right both at index 0.
//
//Increment right until the current window sum is > sum - x
//Update our maxLength if and only if our current window sum == sum - x
//Repeat the above steps until we reach the end of the array.
//image
//
//Awesome! Now we have everything we need to start coding.
//
//How should I approach this question in an interview?
//When you're presented this question, it might not be obvious that there exists a solution other than DP (at least, it wasn't obvious for me!). So, how would you know to approach the question through any other means? What saved me when doing this question was the simple realisation that removing edge values is the same as shrinking the array. Hence, there will always remain a middle subarray of length >= 0.
//
//A habit that I've developed over time whenever I run into trouble coming up with a solution is to reframe the question. Often times when you're given a question in an interview, it's riddled with questionable requirements or red herrings. The interviewer is likely expecting you to extract out the core requirements from the question and truncate it down to as simple a question as you can manage.
//
//It does take time and practice to spot the owl from the trees. That being said, here are some effective ways to ease yourself into the right mindset:
//
//If a question is implicitly asking for A when the question is actually solved using B, draw examples and look for alternate patterns.
//Pay attention to the constraints of the inputs/outputs (in this question, the values being strictly positive was a hint!)
//Be creative! Even try rewording the question to something as different as you can think of while still maintaining the requirements of the question.
//If all else fails, pay attention to the subtle hints your interviewer might be throwing your way. (By the way, the best way to get hints from your interviewer is to explain all your thoughts to them as you go. If they don't know where you're stuck, they can't help you).
