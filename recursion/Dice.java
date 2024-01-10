public class Dice {
    public static void main(String[] args) {
        dice("",4);
    }

    static void dice(String p,int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i = 1 ; i <= 6 && i <= target; i++){
            dice(p + i,target - i);
        }
    }
    //further more can write same program where all the ans is stroed in an arraylist
    //the dice may have custom number of faces
    //just take a face parameter and iterate until face

}
