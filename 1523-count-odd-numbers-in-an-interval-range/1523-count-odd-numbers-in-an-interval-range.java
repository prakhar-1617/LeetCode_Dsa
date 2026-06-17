class Solution {
    public int countOdds(int low, int high) {
        int countoddh=(high+1)/2;    //ye use kr rhe Count odd numbers from 1 to high ke liye:
        int countoddl=low/2;      //Count odd numbers from 1 to low - 1:
        return countoddh - countoddl;
    }
}