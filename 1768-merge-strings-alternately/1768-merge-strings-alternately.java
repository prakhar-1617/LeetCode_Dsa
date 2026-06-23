class Solution {
    public String mergeAlternately(String word1, String word2) {
       StringBuilder s=new StringBuilder();
       int i=0;
       int j=0;
       while(i<word1.length() && j<word2.length()) {
        s.append(word1.charAt(i));
        s.append(word2.charAt(j));
        i++;
        j++;
       }
       if(i<word1.length()){
        s.append(word1.substring(i,word1.length()));
       }
       if(j<word2.length()){
        s.append(word2.substring(j,word2.length()));
       }
       return s.toString();
    }
}