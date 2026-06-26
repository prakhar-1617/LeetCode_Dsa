class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            Stack<Integer> st = new Stack<>();
            int j = nums2.length - 1;
            while (j >= 0) {
                if (nums2[j] == nums1[i]) {
                    while (!st.isEmpty() && st.peek() <= nums1[i]) {
                        st.pop();
                    }
                    if(st.isEmpty()){
                        arr[i]=-1;
                    }
                    else{
                      arr[i]=  st.peek();
                    break;
                    }
                   
                }
                st.push(nums2[j]);
                j--;
            }
        }

        return arr;
    }
}