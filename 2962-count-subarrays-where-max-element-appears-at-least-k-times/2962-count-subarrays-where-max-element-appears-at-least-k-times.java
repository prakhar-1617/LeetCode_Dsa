class Solution {
    public long countSubarrays(int[] nums, int k) {
        long count=0;
        int max=0;
        long res=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }

        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==max){
                count++;
            }
            while(count>=k){
                if(nums[left]==max){
                    count--;
                }
                left++;
            }
                res+=left;
            

        }
        return res;
    }
}