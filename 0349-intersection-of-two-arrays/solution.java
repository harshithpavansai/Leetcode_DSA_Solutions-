class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int num:nums1){
            map1.put(num,map1.getOrDefault(num,0)+1);
        }
        for(int num:nums2){
            map2.put(num,map2.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int key : map1.keySet()) {
            if (map2.containsKey(key)) {
                list.add(key);
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;

    }
}
