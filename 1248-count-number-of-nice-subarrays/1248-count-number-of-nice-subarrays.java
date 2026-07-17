class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return Atmost(nums,k)-Atmost(nums,k-1);
    }
    
    private static int Atmost(int[] nums,int k){
        int left=0;
        int count=0;
        int fincount=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]%2!=0){
             count++;
            }
            while(count>k){
                if(nums[left]%2!=0){
                count--;
                }
                left++;
            }
            fincount+=right-left+1;
        }
        return fincount;
    }
}