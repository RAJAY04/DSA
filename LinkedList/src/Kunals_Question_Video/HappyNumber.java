package Kunals_Question_Video;

class Solution {
    public boolean isHappy(int n) {
        int fast = n , slow = n;
        do{
            fast = findSquare(findSquare(fast));
            slow = findSquare(slow);
        }while( slow != fast);

        return slow == 1;
    }
    public int findSquare(int num){
        int ans = 0 ;
        while(num != 0){
            int rem = num % 10;
            ans += rem * rem;
            num /= 10;
        }
        return ans;
    }
}