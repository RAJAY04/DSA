public class MoveChips {
    public static void main(String[] args) {
        int[] position = {2,2,2,3,3};
//        Output: 1
//        Explanation: First step: Move the chip at position 3 to position 1 with cost = 0.
//        Second step: Move the chip at position 2 to position 1 with cost = 1.
//        Total cost is 1.
        //takes cost =0 to move a chips+-2 steps and cost 1 to move a chips=-1steps
        System.out.println(minCostToMoveChips(position));
    }
//    1.The chips at even index can be shift to any even index with cost 0. right ?
//    2.The chips at odd index can be shift to any odd index with cost 0 . right ?(beacuse taking 2 step move cost 0 )
//    if you agree with my both statement, then shift all chips to any even and odd index position which are neighbour with cost 0 till now.
//    Now we have two tower on adjacent odd-even position ,
//    one tower of the chips at even index
//    one tower of the chips at odd index
//    we need to shift one tower to other tower . so take minimum of both tower which cost minimum cost of movement.
    public static int minCostToMoveChips(int[] position) {
        int evenPosTowerChips = 0;
        int oddPosTowerChips = 0;
        for (int i : position) {
            if (i % 2 == 0) {
                evenPosTowerChips++;
            } else {
                oddPosTowerChips++;
            }
        }
        return Math.min(oddPosTowerChips, evenPosTowerChips);
    }
}
