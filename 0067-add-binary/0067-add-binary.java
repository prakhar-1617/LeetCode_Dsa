class Solution {
    public String addBinary(String a, String b) {

        int carry = 0;
        String res = "";

        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0) {

            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            res += (sum % 2);
            carry = sum / 2;
        }

        if (carry == 1) {
            res += '1';
        }

        String rev = "";

        for (int k = res.length() - 1; k >= 0; k--) {
            rev += res.charAt(k);
        }

        return rev;
    }
}