class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> l1=new ArrayList<>();
        for(int keys:map.keySet()){
            if(map.get(keys)==2){
                l1.add(keys);
            }
        }
        return l1;
    }
}