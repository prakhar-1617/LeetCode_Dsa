class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       //usung binary search for finding targer
       int m=matrix.length;
       int n=matrix[0].length;
    //    if(m==1 && n==1 && matrix[0][0]==target){
    //     return true;
    //    }
       int i=0;
       int j=n-1;
        while(i<=m-1 && j>=0){
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]<target){
                i++;
            }
            else{
            j--;
            }
            }
        
        return false;
    }
}