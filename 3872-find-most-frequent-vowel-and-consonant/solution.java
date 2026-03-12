class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
        map.put(c,map.getOrDefault(c,0)+1);
        }
        int vmax=0;
        int cmax=0;
        for(char c:map.keySet()){
            if(isVowel(c)){
                vmax=Math.max(vmax,map.get(c));
            }
            else{
                cmax=Math.max(cmax,map.get(c));
            }
        }
        return vmax+cmax;
        
    }
    private boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u';
    }
}
