class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int  len=0;
        int left=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                len=right-left+1;
                min=Math.min(min,len);
                sum-=nums[left];
                left++;
            }
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}