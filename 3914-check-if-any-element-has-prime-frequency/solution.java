class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int freq = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    freq++;
                }
            }
            int cnt = 0;
            for (int k = 1; k <= freq; k++) {
                if (freq % k == 0) cnt++;
            }
            if (cnt == 2) {  
                return true;
            }
        }
        return false;
    }
}
