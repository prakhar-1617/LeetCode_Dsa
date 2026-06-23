class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int left=0;
      double  avg=sum/k;
        double maxavg=avg;
        for(int right=k;right<nums.length;right++){
            sum+=nums[right];
             sum-=nums[left];
                left++;
            
            avg=sum/k;
            maxavg=Math.max(maxavg,avg);

        }
        return maxavg;
    }
}