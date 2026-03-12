class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map = new HashMap<>();
        int cnt=0;
        for(int i=0;i<stones.length();i++){
            map.put(stones.charAt(i),map.getOrDefault(stones.charAt(i),0)+1);
        }
        for(int i=0;i<jewels.length();i++){
            char c = jewels.charAt(i);
            if(map.containsKey(c)){
                cnt+=map.get(c);
            }
        }
        return cnt;
    }
}
