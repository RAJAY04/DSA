public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int columnNumber = 701;
//        Output: "AB"
        System.out.println(convertToTitle(columnNumber));
    }
    public static String convertToTitle(int columnNumber) {
        // Create an empty string for storing the characters...
        StringBuilder output = new StringBuilder();
        // Run a while loop while columnNumber is positive...
        while(columnNumber > 0){
            // Subtract 1 from columnNumber...to make it compatible with 0 based indexing
            columnNumber--;
            //if we dont do columnNumber-- -> eg:columnNumber = 27 (original column number)
            //Calculate character: (char) (27 % 26 + 'A') = (char) (1 + 'A') = 'B'
            //which should have been 'A'
            // Get current character by doing modulo of columnNumber by 26...
            //(columnNumber - 1) % 26 this can also be done
            char c = (char) (columnNumber % 26 + 'A');
            // Divide columnNumber by 26...
            columnNumber /= 26;
            // Append the character into output...
            output.append(c);
        }
        // Reverse the output string...
        // Bcause we have found characters from right to left...
        // Return the reversed string.
        return output.reverse().toString();
    }
}
