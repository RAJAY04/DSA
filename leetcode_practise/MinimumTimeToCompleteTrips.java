public class MinimumTimeToCompleteTrips {
    public static void main(String[] args) {
        int[] time = {2};
        int totalTrips = 1;
        System.out.println(minimumTime(time,totalTrips));
    }

    public static long minimumTime(int[] time, int totalTrips) {
        long lowestTime = 1;
        long maxTime = 100000000000000L;
        //why done we take max value of the array as max element value of the array?
        //we take the max value of upper bound as the max value of constraint because
        //1 <= time.length <= 10^5
        //1 <= time[i], totalTrips <= 10^7
        //hence if totalTrips is large the desired ans will not be found if we use upper bound
        //as maximum element in the array
        while(lowestTime < maxTime){
            long mid = lowestTime + (maxTime-lowestTime)/2;
            long tripsDone = tripsCompleted(time, mid, totalTrips);
            if(tripsDone >= totalTrips){
                maxTime = mid;
            }
            else{
                lowestTime = mid+1;
            }
        }
        return lowestTime;
    }

    private static long tripsCompleted(int[] time, long currentTime, int totalTrips){
        long tripsDone = 0;
        for(int t : time){
            long tmp = (long) t;
            tripsDone += (currentTime/tmp);
            // instead of iterating the loop any further, break the loop.
            if(tripsDone >= totalTrips ){
                break;//just little optimisation
            }
        }
        return tripsDone;
    }
}
