class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map=new HashMap<>();
        // for(char ch:jewels.toCharArray()){
            for(char chr:stones.toCharArray()){
                    map.put(chr,map.getOrDefault(chr,0)+1);   
            }
            int count=0;
            for(char keys:map.keySet()){
                for(char ch:jewels.toCharArray()){
                    if(ch==keys){
                        count+=map.get(keys);
                    }
                }
            }
        
        return count;
    }
}