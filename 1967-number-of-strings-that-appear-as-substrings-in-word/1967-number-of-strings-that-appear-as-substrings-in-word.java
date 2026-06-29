class Solution {
    public int numOfStrings(String[] patterns, String word) {
       int count=0;
        for(String st:patterns){
            if(word.indexOf(st)!=-1){
                count++;
            }
        }
        return count;
    }
}