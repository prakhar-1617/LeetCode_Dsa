class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            String s=sentences[i];
            String[] arr=s.split(" ");
            max=Math.max(arr.length,max);
        }
        return max;
    }
}