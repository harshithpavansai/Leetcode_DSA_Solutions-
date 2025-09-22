class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int maxFreq = 0;
        for (int val : map.values()) {
            maxFreq = Math.max(maxFreq, val);
        }
        int total = 0;
        for (int val : map.values()) {
            if (val == maxFreq) {
                total ++;
            }
        }

        return total*maxFreq;
    }
}

