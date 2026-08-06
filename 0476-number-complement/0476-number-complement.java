class Solution {
    public int findComplement(int n) {

        // if (n == 0)
        //     return 1;

        int mask = 0;
        int bit = 0;

        while (mask < n) {
            mask += (1 << bit);
            bit++;
        }

        return mask - n;
    }
}