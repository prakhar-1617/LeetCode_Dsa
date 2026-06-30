class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target==nums[mid]){
                return mid;
            }
            //left half sorted h? aur agr h to uske range me aa rha h target? agar ha to right ko mid-1 kr denge nhi to mtlb left ko mid +1 kr denge
            else if(nums[left]<=nums[mid]){
                if(target>=nums[left] && target<nums[mid]){  //yani us range me h
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }

            else {
                if(target<=nums[right] && target>nums[mid]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}