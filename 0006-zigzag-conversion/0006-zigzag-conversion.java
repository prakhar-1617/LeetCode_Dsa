class Solution {
    public String convert(String s, int numRows) {
        //do it again
        // Edge case
        if (numRows == 1 || s.length() <= numRows)
            return s;

        ArrayList<StringBuilder> rows = new ArrayList<>();

        // Create one StringBuilder for each row
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        int currentRow = 0;
        boolean goingDown = true;

        for (char ch : s.toCharArray()) {

            rows.get(currentRow).append(ch);

            // Change direction at top or bottom
            if (currentRow == 0) {
                goingDown = true;
            } else if (currentRow == numRows - 1) {
                goingDown = false;
            }

            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder ans = new StringBuilder();

        for (StringBuilder sb : rows) {
            ans.append(sb);
        }

        return ans.toString();
    }
}