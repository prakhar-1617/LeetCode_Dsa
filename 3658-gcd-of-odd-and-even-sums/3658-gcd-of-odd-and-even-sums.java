class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumeven=0;
        int sumodd=0;
        for(int i=0;i<2*n;i++){
            if(i%2==0){
                sumeven+=i;
            }
            else{
                sumodd+=i;
            }
        }
        int min=Math.min(sumeven,sumodd);
            for(int i=min;i>=1;i--){
                if(sumeven%i==0 && sumodd%i==0){
                    return i;
                }
            }
        return 1;
    }
}