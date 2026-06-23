class Solution {
    public String reverseWords(String s) {
        String[] st=s.split(" ");
        String ans="";
        for(String str: st){
            String rev="";
            for(int i=str.length()-1;i>=0;i--){
                rev+=str.charAt(i);
            }
            ans+=rev+" ";
        }
        return ans.trim();
    }
}