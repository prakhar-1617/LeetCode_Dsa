class Solution {
    public int halveArray(int[] nums) {
       double sum=0;
       for(int i=0;i<nums.length;i++){
         sum+=nums[i];
       }
       double inithalf=sum/2.0;
        PriorityQueue<Double> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.offer((double)nums[i]);
        }
        int opr=0;
        while(sum>inithalf){
            double val=pq.poll();
            double half=val/2;
            pq.offer(half);
            sum-=val;
            sum+=half;
            opr++;
        }
        return opr;
    }
}