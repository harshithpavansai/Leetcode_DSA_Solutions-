class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length * grid.length;
        int[] freq = new int[n + 1];
        int[] ans = new int[2];
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                int val = grid[i][j];
                sum += val;
                freq[val]++;
                if (freq[val] == 2) {
                    ans[0] = val; 
                }
            }
        }

        int tsum = (n * (n + 1)) / 2;
        ans[1] = tsum - (sum - ans[0]);

        return ans;
    }
}

