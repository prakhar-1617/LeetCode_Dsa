class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr=new int[gain.length+1];
        arr[0]=0;
        int index=1;
     for(int i=0;i<gain.length;i++){
        arr[index]=arr[index-1]+gain[i];
        index++;
        }
        int max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        return max;
    }
}