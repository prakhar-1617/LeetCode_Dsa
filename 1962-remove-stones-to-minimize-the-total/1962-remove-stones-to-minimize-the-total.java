class Solution {
    public int minStoneSum(int[] piles, int k) {
      PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());  //max heap
      for(int i=0;i<piles.length;i++){
        pq.offer(piles[i]);
      }  
      while(k!=0){
        int max=pq.poll();
        pq.offer(max-(int) Math.floor(max/2.0));
        k--;
      }
      int stones=0;
      for(int i:pq){
        stones+=i;
      }
      return stones;
    }
}