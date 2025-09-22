class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int cnt = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                cnt = Math.min(cnt, Math.abs(i - start));
            }
        }
        return cnt;
    }
}
