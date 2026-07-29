class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int ans = 0;
        int left = 0;
        int right = piles.length - 1;
        while (left < right) {
            right--;              
            ans += piles[right];  
            right--;
            left++;              
        }
 return ans;
    }
}