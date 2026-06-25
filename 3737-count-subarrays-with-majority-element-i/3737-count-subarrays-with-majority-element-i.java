class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
       int count=0;
        for(int i=0;i<nums.length;i++){
            int occurence=0;
            for(int j=i;j<nums.length;j++){
                if( nums[j]==target){
                    occurence++;
                }
                    int len=j-i+1;
                    if(occurence>len/2){
                        count++;
                    }
                }
            }
            return count;
        

    }
}