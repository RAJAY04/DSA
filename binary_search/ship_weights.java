public class ship_weights {
    public static void main(String[] args) {
         int[] weight = {1,2,3,4,5,6,7,8,9,10};
         int days= 5;
         System.out.println(shipWithinDays(weight,days));
    }
    public static int shipWithinDays(int[] weights, int days) {
        int max_weight=0;
        int total_weight=0;
        for (int weight:weights) {
            max_weight=Math.max(max_weight,weight);
            total_weight+=weight;
        }
        int s = max_weight, e=total_weight;
        while(s<e){
            int mid = s + ( e - s)/2;
            int cur_days = 1, cur_weight=0;
            for(int weight:weights){
                if(cur_weight+weight>mid){
                    cur_days++;
                    cur_weight=0;
                }
                    cur_weight+=weight;
            }if(cur_days<=days){
                e=mid;
            }else{
                s=mid+1;
            }
        }
        return s;
    }
}
