class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        long sum=0;
        int p=0;
        for(int i=0;i<costs.length;i++){
            sum+=costs[i];
        
        if(sum<=coins){
             p=i+1;
            
        }
        }
        return p;
    }
}