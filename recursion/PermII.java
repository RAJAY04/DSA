import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermII {
    static List<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        permuteUnique(nums);
        System.out.println(res);
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums, new ArrayList<>(), new boolean[nums.length]);
        return res;
    }

    public static void backtrack(int[] nums, List<Integer> p, boolean[] visited) {
        if (p.size() == nums.length) {
            res.add(new ArrayList<>(p));
            return;
        }

        int lastRemoved = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] || nums[i] == lastRemoved) {
                continue;
            }
            visited[i] = true;
            p.add(nums[i]);
            backtrack(nums, p, visited);
            visited[i] = false;
            lastRemoved = p.remove(p.size() - 1);
        }
    }
}
