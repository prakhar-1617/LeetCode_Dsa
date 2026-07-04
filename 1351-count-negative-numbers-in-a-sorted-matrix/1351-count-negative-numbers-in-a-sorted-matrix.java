class Solution {
    public int countNegatives(int[][] grid) {

        int count = 0;

        for (int[] row : grid) {

            int left = 0;
            int right = row.length;

            while (left < right) {

                int mid = left + (right - left) / 2;

                if (row[mid] < 0) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }

            count += row.length - left;
        }

        return count;
    }
}