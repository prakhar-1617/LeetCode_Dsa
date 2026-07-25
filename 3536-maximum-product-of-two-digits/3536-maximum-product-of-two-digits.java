class Solution {
    public int maxProduct(int n) {
        int max=0;
        int secmax=0;
        while(n>=1){
            int p=n%10;
            if(p>max){
                secmax=max;
                max=p;
            }
             else if (p > secmax) {
                secmax = p;
            }
          
            n/=10;
         

        }
      
        return max*secmax;
    }
}