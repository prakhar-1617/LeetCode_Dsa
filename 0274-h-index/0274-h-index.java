class Solution {
    public int hIndex(int[] citations) {
        int ans=0;
for (int h = 0; h <= citations.length; h++) {
    int count = 0;

    for (int citation : citations) {
        if (citation >= h)
            count++;
    }

    if (count >= h)
        ans = h;
}
        return ans;
    }
}