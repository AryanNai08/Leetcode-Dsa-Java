public class Leetcode_06 {

    public static String convert(String s, int numRows) {

        // Edge case
        if (numRows == 1 || s.length() <= numRows)
            return s;

        StringBuilder[] rows = new StringBuilder[numRows];

        // initialize each row
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {

            rows[currentRow].append(c);

            // change direction at top & bottom
            if (currentRow == 0 || currentRow == numRows - 1)
                goingDown = !goingDown;

            currentRow += goingDown ? 1 : -1;
        }

        // combine all rows
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows));
    }
}