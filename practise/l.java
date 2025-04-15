class Solution {
    public int maxProfit(int[] prices) {
        int mx = 0 , n = prices.length;
        int cur = prices[0];

        for (int i = 1; i < n; i++) {
            mx = Math.max(mx , prices[i] - cur);
            if (prices[i] < cur) {
                cur = prices[i];
            }
        }
        return mx;

    }
}