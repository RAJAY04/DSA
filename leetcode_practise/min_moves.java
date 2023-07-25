public class min_moves {
    public static void main(String[] args) {
        int target = 4;
        System.out.println(reachNumber(target));
        // Output: 3
        // Explanation:
        // On the 1st move, we step from 0 to 1 (1 step).
        // On the 2nd move, we step from 1 to 3 (2 steps).
        // On the 3rd move, we step from 3 to 4 (1 step).
    }

    public static int reachNumber(int target) {
        target = Math.abs(target); // Consider the absolute value of the target

        int move = 0;
        int currentPos = 0;

        while (currentPos < target || (currentPos - target) % 2 != 0) {
            move++;
            currentPos += move;
        }

        return move;
    }
}
