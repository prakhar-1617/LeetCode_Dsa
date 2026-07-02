class Solution {
    public int hIndex(int[] citations) {
        int ans=0;
        // int left=0;
        // int right=citations.length;
        // while(left<=right){
        //     int mid=left+(right-left)/2;
        //     int paper=
        // }

        for(int i=0;i<citations.length;i++){
            if(citations[i]>=citations.length-i){
                return citations.length-i;
            }
        }
        return 0;
    }
}