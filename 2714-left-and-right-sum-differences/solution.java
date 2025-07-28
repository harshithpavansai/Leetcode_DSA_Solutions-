class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftarr = new int[nums.length];
        int[] rightarr = new int[nums.length];
        int[] resultarr = new int[nums.length];

        leftarr[0] = 0;
        rightarr[nums.length - 1] = 0;

        for (int i = 1, j = nums.length - 2; i < nums.length && j >= 0; i++, j--) {
            leftarr[i] = leftarr[i - 1] + nums[i - 1];
            rightarr[j] = rightarr[j + 1] + nums[j + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            resultarr[i] = Math.abs(leftarr[i] - rightarr[i]);
        }

        return resultarr;
    }
}
