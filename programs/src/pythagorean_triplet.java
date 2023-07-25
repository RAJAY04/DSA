public class pythagorean_triplet {
    public static void main(String[] args) {

        System.out.println(pythagorean(3,4,5));
    }

    private static boolean pythagorean(int n1, int n2 , int n3) {
        return (n3*n3) == ((n1*n1) + (n2*n2));
    }

}