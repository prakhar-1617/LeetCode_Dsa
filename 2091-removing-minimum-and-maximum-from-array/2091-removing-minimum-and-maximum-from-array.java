class Solution {
    public int minimumDeletions(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }

            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        int n = nums.length;

        int left = Math.max(minIndex, maxIndex) + 1;

        int right = n - Math.min(minIndex, maxIndex);

        int both = Math.min(
                (minIndex + 1) + (n - maxIndex),
                (maxIndex + 1) + (n - minIndex)
        );

        return Math.min(left, Math.min(right, both));
    }
}