public class IsUniqueI {
    // Every number appears thrice, find the number that appears only once
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 2, 7, 8, 8, 8, 7, 7};
        System.out.println(findUnique(arr));
    }

    private static int findUnique(int[] arr) {
        int[] bitsSum = new int[32]; // Assuming 32-bit integers

        // Calculate the sum of bits at each position for all numbers in the array
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int pos = 0;

            while (num > 0) {
                bitsSum[pos] += num & 1; // Add the rightmost bit to the corresponding position
                num >>= 1; // Right shift the number by 1 bit
                pos++;
            }
        }

        int unique = 0;

        // Construct the unique number by checking the sum of bits at each position
        for (int i = 0; i < 32; i++) {
            bitsSum[i] %= 3; // Take modulo 3 to remove the contributions of numbers appearing thrice
            unique |= bitsSum[i] << i; // Set the corresponding bit in the unique number
        }

        return unique;
    }
}
