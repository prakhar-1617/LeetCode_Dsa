class Solution {
    public boolean sumOfNumberAndReverse(int num) {

        for (int i = 0; i <= num; i++) {

            int x = i;
            int rev = 0;

            while (x > 0) {
int p=x%10;

                rev = rev * 10 + p; 
                x /= 10;
            }

            if (i + rev == num) {
                return true;
            }
        }

        return false;
    }
} 