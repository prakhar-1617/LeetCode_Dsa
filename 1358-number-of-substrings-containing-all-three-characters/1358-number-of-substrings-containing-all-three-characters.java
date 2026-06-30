class Solution {
    public int numberOfSubstrings(String s) {
        int[] freq = new int[3];   // freq[0]=a, freq[1]=b, freq[2]=c
        int left = 0;
        int ans = 0;
        int n = s.length();

        for (int right = 0; right < n; right++) {

            // Add current character to the window
            freq[s.charAt(right) - 'a']++;

            // While window contains at least one a, b, and c
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {

                // All substrings from right to end are valid
                ans += (n - right);

                // Shrink the window
                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return ans;
    }
}