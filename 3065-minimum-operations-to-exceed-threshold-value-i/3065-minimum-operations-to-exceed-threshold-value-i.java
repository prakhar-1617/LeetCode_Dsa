class Solution {
    public int minOperations(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.offer(num);
        }

        while (!pq.isEmpty() && pq.peek() < k) {
            pq.poll();
        }

        return nums.length - pq.size();
    }
}