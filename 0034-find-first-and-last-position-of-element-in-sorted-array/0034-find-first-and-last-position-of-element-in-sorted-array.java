class Solution {
    public int[] searchRange(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int firstOcc = -1;
        int lastOcc = -1;

        // Find First Occurrence
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                firstOcc = mid;
                end = mid - 1;      // Search on left side
            }
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        // Reset for second binary search
        start = 0;
        end = nums.length - 1;

        // Find Last Occurrence
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                lastOcc = mid;
                start = mid + 1;    // Search on right side
            }
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return new int[]{firstOcc, lastOcc};
    }
}