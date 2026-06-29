class Solution {
    public int minOperations(int[] nums, int k) {
            int opr=0;
            PriorityQueue<Long> pq=new PriorityQueue<>();
            for(int i=0;i<nums.length;i++){
                pq.offer((long)nums[i]);
            }
            
            while(pq.size()>=2 && pq.peek()<k){
            long x=pq.poll();
            long y=pq.poll();
            pq.offer(Math.min(x,y)*2+Math.max(x,y));
            opr++;
            }
            return opr;
    }
}