class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int left=0;
        int max=0;
        for(int right=0;right<nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            sum+=nums[right];
            while(map.get(nums[right])>1){
         map.put(nums[left], map.get(nums[left]) - 1);

                sum-=nums[left];
                left++;
            }
            max=Math.max(sum,max);

        }
        
        return max;
    }
}