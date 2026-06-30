class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
         List<Integer> arr=new ArrayList<>();

        for(int i=min;i<=max;i++){
            arr.add(i);
        }
        for( int i=0;i<nums.length;i++){
            if(arr.contains(nums[i])){
               arr.remove(Integer.valueOf(nums[i]));
            }
        }
        
       return arr;
        
    }
}