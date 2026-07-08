class Solution {
    public boolean canJump(int[] nums) {
        //solving using greedy algo
        int maxidx=0;
        if(nums.length==1){
            return true;
        }
        for(int i=0;i<nums.length;i++){
           
            if(i>maxidx){
            return false;
        }
         maxidx=Math.max(nums[i]+i,maxidx);
            
        }
         
        return true;
    }
}