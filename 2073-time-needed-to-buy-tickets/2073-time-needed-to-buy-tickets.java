class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
       // Queue<Integer> q=new Queue<>();
      int ans = 0;

for(int i=0;i<tickets.length;i++){

    if(i<=k)
        ans += Math.min(tickets[i],tickets[k]);
    else
        ans += Math.min(tickets[i],tickets[k]-1);

}

return ans;
    }
    }