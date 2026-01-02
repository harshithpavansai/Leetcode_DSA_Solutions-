class Solution {
    public int singleNumber(int[] nums) {
         HashMap<Integer, Integer> h = new HashMap<>();

        for (int i : nums) {
            h.put(i, h.getOrDefault(i, 0) + 1);
        }
        for (int key : h.keySet()) {
            if (h.get(key) == 1) {
                return key;
            }
        }

        return -1;
    }
}
