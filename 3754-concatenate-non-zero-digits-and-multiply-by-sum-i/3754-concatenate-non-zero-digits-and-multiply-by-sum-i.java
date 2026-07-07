class Solution {
    public long sumAndMultiply(int n) {
        long val=0;
        long sum=0;
        while(n>0){
            long p=n%10;
            if(p!=0){
                val=val*10+p;
                sum+=p;
            }
            n=n/10;
        }
         String s=""+val;
         String st="";
       for(int i=s.length()-1;i>=0;i--){
        st+=s.charAt(i);
       }
       int rev=Integer.parseInt(st);
        return (long)rev*sum;
    }
}