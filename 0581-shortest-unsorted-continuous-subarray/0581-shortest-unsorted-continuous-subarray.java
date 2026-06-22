class Solution {
    public int findUnsortedSubarray(int[] nums) {
     int[] arr = Arrays.copyOf(nums, nums.length);
     Arrays.sort(arr);
       int i=0;
       int left=0;
       while(i<arr.length){
        if(arr[i]!=nums[i]){
             left=i;
            break;
        }
        i++;
       }
        int j=arr.length-1;
        int right=0;
        while(j>=0){
        if(arr[j]!=nums[j]){
             right=j;
            break;
        }
        j--;
       }
       return (right-left+1)==1?0:right-left+1;

    }
}