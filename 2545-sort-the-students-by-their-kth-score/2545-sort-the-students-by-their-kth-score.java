class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int len=score.length;
         //this loop iterates through total rows-1 times, because the last will be naturally sorted
        for(int r=0; r<len-1; r++){
            //this loop iterates through the remaining rows below r to compare their scores in column k
            for(int c=r+1; c<len; c++){
                if(score[r][k] < score[c][k]){
                    int[] temp = score[r];
                    score[r] = score[c];
                    score[c] = temp;
                }
            }
        }
        return score;
    }
}