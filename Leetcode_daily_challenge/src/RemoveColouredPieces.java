import java.util.HashMap;
import java.util.Map;

public class RemoveColouredPieces {
    public static void main(String[] args) {
        String colors = "AAABABB";
//        Output: true
//        Explanation:
//        AAABABB -> AABABB
//        Alice moves first.
//                She removes the second 'A' from the left since that is the only 'A' whose neighbors are both 'A'.
//
//                Now it's Bob's turn.
//        Bob cannot make a move on his turn since there are no 'B's whose neighbors are both 'B'.
//                Thus, Alice wins, so return true.
        System.out.println(winnerOfGame1(colors));
    }

    public static boolean winnerOfGame1(String colors) {
        Map<Character, Integer> c = new HashMap<>();
        c.put('A', 0);
        c.put('B', 0);

        for (int i = 0; i < colors.length(); i++) {
            char x = colors.charAt(i);
            int count = 0;

            while (i < colors.length() && colors.charAt(i) == x) {
                i++;
                count++;
            }

            c.put(x, c.get(x) + Math.max(count - 2, 0));
            i--;
        }

        return c.get('A') > c.get('B');
    }
    public static boolean winnerOfGame(String colors) {
        int a_count = 0;
        int b_count = 0;
        for(int i = 0 ; i < colors.length() - 2; i++){
            char c1 = colors.charAt(i);
            char c2 = colors.charAt(i + 1);
            char c3 = colors.charAt(i + 2);
            if(c1 == c2 && c2 == c3){
                if(c1 == 'A')a_count++;
                else b_count++;
            }

        }return a_count > b_count;
    }
}
