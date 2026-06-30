class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int min=0;

        while(left<=right){

             //if Array already sorted
            if (nums[left] <= nums[right]) {
                return nums[left];
            }

            int mid=left+(right-left)/2;

            int next=(mid+1)%nums.length;   
          int  prev=(mid+nums.length-1)%nums.length;

// agr mid ka next aur prev dono hi bda h to whi min element hoga
            if(nums[prev]>nums[mid] && nums[next]>nums[mid]){
                min=nums[mid];
                break;
            }
           //agr left chota h mid se to mtlb ye sorted array h to unsorted me hi min hoga
            else if(nums[left]<=nums[mid]){
                left=mid+1;
            }
            else{   //mtln unsorted aaray left wala h
                right=mid-1;
            }
            }
        
        return min;
    }
}