class Solution {
    public int maxVowels(String s, int k) {
        char[] str = s.toCharArray();
        int countvow=0;
        for(int i = 0; i < k; i++) {
        if("aeiou".indexOf(str[i])!=-1){
            countvow++;
        }
        }
        int maxcountvow=countvow;
       // int slidingcount = 0;
        int left=0;
        for(int right = k; right < str.length; right++) {
            if("aeiou".indexOf(str[right]) != -1) {
                           countvow++;
            }
             if("aeiou".indexOf(str[left]) != -1){
                countvow--;
            }
             left++;
            maxcountvow=Math.max(maxcountvow,countvow);
        }
        return maxcountvow;
    }
}