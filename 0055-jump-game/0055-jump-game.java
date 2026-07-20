class Solution {
    public boolean canJump(int[] nums) {
        //solving using greedy algo
        int maxidx=0;
        if(nums.length==1){
            return true;
        }
        for(int i=0;i<nums.length;i++){
           
            if(i>maxidx){  //Agar current index hi reachable nahi hai (i > maxidx), to aage kabhi bhi nahi ja paoge.Isliye directly false.
            return false;
        }
         maxidx=Math.max(nums[i]+i,maxidx);
            
        }
         
        return true;
    }
}