package Strings;

public class RotateString {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "abced"));
    }

    public static boolean rotateString1(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        return (s + s).contains(goal);
    }

    public static boolean rotateString(String s, String goal) {
        if (s == null || goal == null) return false;
        //actully throwing null pointer exception
        if (s.length() != goal.length()) return false;
        if (s.length() == 0) return true;
        for (int i = 0; i < s.length(); i++) {
            if (rotateString(s, goal, i)) return true;
        }
        return false;
    }

    public static boolean rotateString(String s, String goal, int rotation) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt((i + rotation) % goal.length())) return false;
        }
        return true;
    }
}
