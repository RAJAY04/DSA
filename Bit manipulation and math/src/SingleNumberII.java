

public class SingleNumberII {
    public static void main(String[] args) {
        int [] nums = {2,2,3,2};
        System.out.println(singleNumber1(nums));
//        nums = [2,2,3,2]
//Output: 3
    }
    public static int singleNumber(int[] nums) {
        int ones = 0 , twos = 0 ;
        //we use property of ^ -> a^a=0; a^0 = a;
        for( int i = 0; i< nums.length;i++){
            //ones is only updated to value of num if there is nothing in twos-> ~twos returnes 1
            //if twos contains nums then ~ twos will return 0 and hence ones wont be updated because it will be a count for three and not ones
            //order of numbers dosent matter as internally at bit levels operations are taking place
            ones = ( ones ^ nums[i]) & ~ twos;
            //same way for twos , only update twos if one is not present
            twos = ( twos ^ nums[i]) & ~ ones;
        }
        return ones;
        //O(n) and O(1) t and s c
    }
    //in this approach we are counting the occurence of bits in each position and in the we are dividing
    //the sum of all bit occurences by 3 , if remainder is 0 it means that all the bits have occured 3 times
    //if one number has occures one time then the remainder wont be 0 and equal to that number
    public static int singleNumber1(int[] nums) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for( final int num : nums){
                //note that we are counting the 1st bit of all the number and then second and soo on
                sum += num >> i & 1 ;//counts the number of 1's at the bit position
                sum%=3;
                ans |= sum << i;//updating the ans
            }
        }
        return ans;
    }
}
