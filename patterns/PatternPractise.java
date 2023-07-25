public class PatternPractise {

    public static void main(String[] args) {
        pattern12(5);
    }

    private static void pattern1(int n) {
//    *****
//    *****
//    *****
//    *****
//    *****
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern2(int n) {
//*
//* *
//* * *
//* * * *
//* * * * *

        for (int row = 0; row < n; row++) {
            for (int col = 0; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern3(int n) {
//* * * * *
//* * * *
//* * *
//* *
//*
        for (int row = n; row >0; row--) {
            for (int col = 0; col < row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern4(int n) {
//        1
//        12
//        123
//        1234
//        12345
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(col );
            }
            System.out.println();
        }
    }

    private static void pattern5(int n) {
//*
//* *
//* * *
//* * * *
//* * * * *
//* * * *
//* * *
//* *
//*
        for (int row = 0; row < 2* n; row++) {
            int cols_needed = row <n ? row : 2*n-row;
            for (int col = 0; col < cols_needed ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pattern6(int n) {
//    *
//   **
//  ***
// ****
//*****
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern7(int n) {
//*****
// ****
//  ***
//   **
//    *
        for (int row = 0; row<n; row++) {
            for (int space = 0; space < row ; space++) {
                System.out.print(" ");
            }
            for (int col = n-row; col > 0 ; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern8(int n) {
//    *
//   ***
//  *****
// *******
//*********
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row+row-1 ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern9(int n) {
//*********
// *******
//  *****
//   ***
//    *
        for (int row = 0; row < n; row++) {
            for (int space = 1; space <= (2*n-1)-(2* n -1-row); space++) {
                System.out.print(" ");
            }
            for (int col = 2*n -1-(2*row); col >0 ; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern10(int n) {
//         *
//        * *
//       * * *
//      * * * *
//     * * * * *
        for (int row = 1; row <= n; row++) {
            for (int space = n - row; space >0; space--) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pattern11(int n) {
//     * * * * *
//      * * * *
//       * * *
//        * *
//         *
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space < row; space++) {
                System.out.print(" ");
            }
            for (int col = n-row+1 ; col > 0 ; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern12(int n) {
//     * * * * *
//      * * * *
//       * * *
//        * *
//         *
//         *
//        * *
//       * * *
//      * * * *
//     * * * * *
        for (int row = 1; row <= 2*n; row++) {
            int space_needed = row<=n? row :2*n-row-1;
            for (int space = 1; space <space_needed; space++) {
                System.out.print(" ");
            }
            int col_needed= n-space_needed;
            for (int col = 0; col < col_needed ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


