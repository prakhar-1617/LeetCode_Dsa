class Solution {
    public int[] singleNumber(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int n:nums){
        map.put(n,map.getOrDefault(n,0)+1);
       } 
       int i=0;
       int[] arr=new int[2];
       for(int key:map.keySet()){
        if(map.get(key)==1){
            arr[i]=key;
            i++;
           
        }
       }
       return arr;
    }
} 
