class Solution {
    public int findGCD(int[] nums) {
        int max=0;
        int min=1001;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            min=Math.min(nums[i],min);

        }
        for(int i=min;i>=1;i--){
            if(min%i==0 && max%i==0){
                return i;
            }
        }
        return 0;
    }
}