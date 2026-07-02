class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        int res=0;
        int left=1;
        int right=max;
        while(left<=right){
            int mid=left+(right-left)/2;
            long sum=0;
            for(int i=0;i<piles.length;i++){
                sum+=Math.ceil((double)piles[i]/mid);
            }
            if(sum<=h){
                 res=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return res;
    }
}