class Solution {
    public int smallestEvenMultiple(int n) {
        int i=1;
       while(true){
        int mul=n*i;
        if(mul%2==0){
            return mul;
        }
        i++;
       }
      // return 0;
    }
}