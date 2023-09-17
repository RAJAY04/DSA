package BinarySearch;

public class CapacityToShip {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
//        Output: 15
//        Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
//        1st day: 1, 2, 3, 4, 5
//        2nd day: 6, 7
//        3rd day: 8
//        4th day: 9
//        5th day: 10
        System.out.println(shipWithinDays(weights,days));
    }
    public static int shipWithinDays(int[] weights, int days) {
        int total_weight = weights[0];
        int max_weight = weights[0];
        for(int i = 1 ; i < weights.length; i++){
            total_weight += weights[i];
            max_weight = Math.max(max_weight, weights[i]);
        }
        int low = max_weight , high = total_weight;
        while( low <= high){
            int mid = low +( high - low ) / 2;
            if(curDays(weights,mid,days) <= days){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }return low;
    }
    //the main effeciency killing mistake i did was whenever capacity crossed i would set the
    //cur_ capacity to 0 without increasing the i and then again start iteration
    //which would cost me some extra iterations
    //and also note that set the cut_days to 1 in the begening
    public static int curDays(int[] weights , int capacity , int days){
        int cur_days = 1 , cur_capacity = 0;
        //start form days = 1 remember!!!!!!;
        for (int i = 0; i < weights.length; i++) {
            if(cur_capacity + weights[i] <= capacity){
                cur_capacity += weights[i];//load more weighs
            }else{
                cur_capacity = weights[i];//reduce current weight
                cur_days++;
            }
            if(cur_days > days)return cur_days;//little bit optimisation
        }return cur_days;
    }
}
