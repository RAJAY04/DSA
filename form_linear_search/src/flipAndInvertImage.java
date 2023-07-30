import java.util.Arrays;

public class flipAndInvertImage {


    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
//        Output: [[1,0,0],[0,1,0],[1,1,1]]
//        First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
//       Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
        int[][] ans = flipAndInvertImage(image);
        System.out.println();
    }
    // this is the easiest approch using bit manipulation
    public static int[][] flipAndInvertImage1(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < (image[0].length + 1) / 2; j++) {
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][image[0].length - j - 1] ^ 1;
                image[i][image[0].length - j - 1] = temp;
            }
        }
        return image;
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] ans = new int[n][];
        for (int i = 0; i < n; i++) {
            int m = image[i].length;
            ans[i] = new int[m];
            for (int j = 0; j < m; j++) {
                ans[i][j] = image[i][(m) - (j) - (1)];
                if (ans[i][j] == 0) {
                    ans[i][j] = 1;
                } else {
                    ans[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(ans));
        return ans;
    }
}

