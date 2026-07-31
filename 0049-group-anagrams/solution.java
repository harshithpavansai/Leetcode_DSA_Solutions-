class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
    HashMap<String,List<String>> map = new HashMap<>();
    int n = s.length;
    for(int i=0;i<n;i++){
        char[] ca = s[i].toCharArray();
        Arrays.sort(ca);
        String key = new String(ca);
        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
        map.get(key).add(s[i]);
    }
    return new ArrayList<>(map.values());
    }
}
