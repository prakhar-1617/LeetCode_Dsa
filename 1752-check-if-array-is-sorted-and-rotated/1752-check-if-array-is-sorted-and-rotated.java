class Solution {
    public boolean check(int[] nums) {
        //isme drop ka concept use krennge
        int count = 0;
        int n = nums.length;
        for(int i = 0; i < n - 1; i++) {
            if(nums[i] > nums[i + 1]) {
                count++;
            }
        }
        // Last element vs First element ko check krne ke liye
        if(nums[n - 1] > nums[0]) {
            count++;
        }

        return count <= 1;
    }
}