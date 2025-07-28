class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            int original = nums[i];  
            if (nums[i] >= 10) {
                int sums = 0;
                while (nums[i] != 0) {
                    sums += nums[i] % 10;
                    nums[i] /= 10;
                }
                nums[i] = original; 
                sum += sums;
            } else {
                sum += nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        return total - sum;
    }
}

