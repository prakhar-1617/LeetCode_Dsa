class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int max=0;
        for(char keys:map.keySet()){
            if(map.get(keys)>max){
                max=map.get(keys);
            }
        }
        String ans="";
       for(int count = max; count >= 1; count--){
         for(char keys:map.keySet()){
            if(map.get(keys)==count){
                int i=count;
                while(i>0){
                    ans+=keys;
                    i--;
                }
            }
         }

    }
    return ans;
}
}