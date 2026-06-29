class Solution {
    public long maxKelements(int[] nums, int k) {
   PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            pq.offer(nums[i]);
        }
        long score = 0;
        while (k != 0) {
            int max = pq.poll();
            score += max;
            pq.offer((int) Math.ceil(max / 3.0));
            k--;
        }
        return score;
    }
}