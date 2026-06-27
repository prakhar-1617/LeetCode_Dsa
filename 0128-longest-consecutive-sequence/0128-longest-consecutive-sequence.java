class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        if(set.size() <= 1){
            return set.size();
        }
     List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int max=1;
        int count=1;
          for(int i=0;i<list.size()-1;i++){
            
            if(list.get(i)+1==list.get(i+1)){
                count++;
                max=Math.max(count,max);
            }
            else{
                count=1;
            }
           //// max=Math.max(count,max);
        }
        return max;
    }
}