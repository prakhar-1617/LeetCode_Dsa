class Solution {
    public long[] sumOfThree(long num) {

        if (num % 3 != 0)   //means triplet is not poosible
            return new long[]{};

        long x = num / 3 ;

        return new long[]{x-1, x , x + 1};
    }
}