class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(String s : words ){
            for(int i=0;i<s.length();i++){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }
        }
        for(int i : map.values()){
            if(i%words.length!=0){
                return false;
            }
        }
        return true;
    }
}
