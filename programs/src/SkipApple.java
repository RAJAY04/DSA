package src;

public class SkipApple {
    public static void main(String[] args) {
        String inp = "abcappleefgapple";
        System.out.println(skip(inp));
    }

    private static String skip(String inp) {
        if (inp.length() == 0) {
            return "";
        }
        if (inp.startsWith("apple")) {
            return skip(inp.substring(5));
        }
        return inp.charAt(0) + skip(inp.substring(1));
    }
}
