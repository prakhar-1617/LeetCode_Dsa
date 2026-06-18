class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num==0){
            return true;
        }
        for(int i=1;i<num;i++){
        int orgnum=num;
        int rev=0;
        String s=""+i;
      String reversed = new StringBuilder(s).reverse().toString();
      int a=Integer.parseInt(s);
      int b=Integer.parseInt(reversed);
      if(a+b==num){

        return true;
      }
        }
        
        return false;
    }
}