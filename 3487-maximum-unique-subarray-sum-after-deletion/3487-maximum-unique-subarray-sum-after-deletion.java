class Solution {
    public int maxSum(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        int sum = 0;
        int max = nums[0];

        for (int x : nums) {

            max = Math.max(max, x);

            if (x > 0 && !set.contains(x)) {
                set.add(x);
                sum += x;
            }
        }

        return sum == 0 ? max : sum;
    }
}