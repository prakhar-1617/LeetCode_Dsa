class Solution {
    public boolean isPerfectSquare(int num) {
        // for(long i=0;i<=num;i++){
        //     if(i*i==num){
        //         return true;
        //     }
        // }
        // return false;
        long left=0;
        long right=num;
        while(left<=right){
            long mid=left+(right-left)/2;
            if(mid*mid==num){
                return true;
            }
            else if(mid*mid<num){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
    }
}