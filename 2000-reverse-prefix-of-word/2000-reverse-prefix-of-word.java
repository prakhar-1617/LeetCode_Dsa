class Solution {
    public String reversePrefix(String word, char ch) {
    String s="";
    int idx=-1;
    for(int i=0;i<word.length();i++){
        if(word.charAt(i)==ch){
             idx=i;
            break;
        }
    }
    for(int i=idx;i>=0;i--){
        s+=word.charAt(i);
    }
    s+=word.substring(idx+1,word.length());

if(idx==-1){
    return word;
}
return s;
    }
}