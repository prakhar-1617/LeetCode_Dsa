class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[256];
        int left=0;
        int res=0;
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)]++;

            int maxcount=findmax(freq);
            int len=right-left+1;
            int diff=len-maxcount;

            while(diff>k){
                freq[s.charAt(left)]--;
                left++;
                maxcount=findmax(freq);
                len=right-left+1;
                diff=len-maxcount;
            }
            len=right-left+1;
            res=Math.max(len,res);

        }
        return res;
    }
    
      public int findmax(int[] freq) {
        int maxCount = -1;

        for (int i = 0; i < 256; i++) {
            maxCount = Math.max(maxCount, freq[i]);
        }

        return maxCount;
    }
}