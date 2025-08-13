class Solution {
    boolean isprime(int a) {
        if (a < 2) return false; // 0, 1 are not prime
        if (a == 2 || a == 3) return true; // 2, 3 are prime
        if (a % 2 == 0 || a % 3 == 0) return false; // even numbers > 2 not prime

        for (int i = 5; i * i <= a; i += 6) {
            if (a % i == 0 || a % (i + 2) == 0) return false;
        }
        return true;
    }

    public int diagonalPrime(int[][] nums) {
        int max = 0;
        int n = nums.length;

        for (int j = 0; j < n; j++) {
            if (isprime(nums[j][j])) {
                max = Math.max(max, nums[j][j]);
            }
            if (isprime(nums[j][n - 1 - j])) {
                max = Math.max(max, nums[j][n - 1 - j]);
            }
        }
        return max;
    }
}
