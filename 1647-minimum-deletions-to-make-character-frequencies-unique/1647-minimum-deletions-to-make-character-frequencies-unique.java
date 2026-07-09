class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(char keys:map.keySet()){
            pq.offer(map.get(keys));
        }
        int count=0;

      while(!pq.isEmpty()){
          int curr = pq.poll();
        if(!pq.isEmpty() && curr==pq.peek()){
                 count++;

        if (curr > 1) {
            pq.offer(curr - 1);
    
            }
        }
      }
        return count;
    }
}