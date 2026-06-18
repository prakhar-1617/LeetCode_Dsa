class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        //usnig sliding window
        if (k <= 1) return 0;   //for edge case
        int left=0;
        int prod=1;
        int count=0;
        for(int right=0;right<nums.length;right++){
            prod*=nums[right];
            while(prod>=k){    //tb tk left wala htana h jb tk prod k ke below na ho jaye
                prod/=nums[left];
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
}