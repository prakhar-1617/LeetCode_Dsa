class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] st=new String[score.length];
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<score.length;i++){
            pq.offer(score[i]);
        }
        HashMap<Integer,Integer> map=new HashMap<>();
       int idx=1;
       while(!pq.isEmpty()){
            map.put(pq.poll(),idx++);
       }

        for(int i=0;i<score.length;i++){
           int value= map.get(score[i]);
            if(value==1){
                st[i]="Gold Medal";
            }
            else if(value==2){
                st[i]="Silver Medal";
            }
            else if(value==3){
                st[i]="Bronze Medal";
            }
            else{
                st[i]=""+value;
            }

            }
            return st;
        

        
    }
}