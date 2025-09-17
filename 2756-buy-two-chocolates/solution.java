class Solution {
    public int buyChoco(int[] prices, int money) {
        int n = prices.length;
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int cost = prices[i] + prices[j];  
                if (cost <= money) {
                    minCost = Math.min(minCost, cost);
                }
            }
        }
        return minCost == Integer.MAX_VALUE ? money : money - minCost;
    }
}

