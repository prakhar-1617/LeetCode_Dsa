class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res=new int[nums.length];
        int[] pos=new int[nums.length/2];
         int[] neg=new int[nums.length/2];
         int a=0;
         int b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos[a]=nums[i];
                a++;
            }
            else{
                neg[b]=nums[i];
                b++;
            }
        
        }
        int p=0;
        int n=0;
        int idx=0;
        while(p<pos.length && n<neg.length){
            res[idx++]=pos[p];
            res[idx++]=neg[n];
          
            p++;
            n++;
        }
        return res;
    }
}