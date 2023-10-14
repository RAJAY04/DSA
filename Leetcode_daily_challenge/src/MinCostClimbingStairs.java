public class MinCostClimbingStairs {
    //it is a typical dynamic programming probelm , go through it as i didnt understand it , somehow \
    //found a method which solves it without using dp
    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
//        Output: 6
//        Explanation: You will start at index 0.
//                - Pay 1 and climb two steps to reach index 2.
//                - Pay 1 and climb two steps to reach index 4.
//                - Pay 1 and climb two steps to reach index 6.
//                - Pay 1 and climb one step to reach index 7.
//                - Pay 1 and climb two steps to reach index 9.
//                - Pay 1 and climb one step to reach the top.
//        The total cost is 6.
        System.out.println(minCostClimbingStairs(cost));
    }
    public static int minCostClimbingStairs(int[] cost) {
        for(int i = 2 ; i < cost.length; i++){
            cost[i] += Math.min(cost[i - 1] , cost[ i - 2]);
        }
        return Math.min(cost[cost.length - 1 ], cost[cost.length - 2]);
    }
}
//We start iterating from index 2, since the first two steps are fixed (index 0 and 1).
//
//At each index i, we want to find the minimum cost to reach there.
//
//To reach index i, we could have reached from either index i-1 or i-2.
//
//So the minimum cost to reach i would be cost[i] plus minimum of cost to reach i-1 and i-2.
//
//This is reflected in the line: cost[i] += Math.min(cost[i - 1], cost[i - 2]);
//
//Finally, the minimum cost would be minimum of cost to reach the top from the last and second last step.
