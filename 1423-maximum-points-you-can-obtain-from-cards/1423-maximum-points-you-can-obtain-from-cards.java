class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int firsum = 0;
        for (int i = 0; i < k; i++) {
            firsum += cardPoints[i];
        }
        int ans = firsum;
        int last = cardPoints.length - 1;
        for (int i = k - 1; i >= 0; i--) {
 firsum -= cardPoints[i];       
            firsum += cardPoints[last];   
            ans = Math.max(ans, firsum);
            last--;
        }
        return ans;
    }
}