class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> m = new HashMap<>();
        
        for(int i=0;i<s1.length();i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
            m.put(s2.charAt(i),m.getOrDefault(s2.charAt(i),0)+1);
        }
        // int k = s1.length();
        
        int i=0;
        int j = s1.length();
        while(j<s2.length() && !map.equals(m)){
            m.put(s2.charAt(i),m.getOrDefault(s2.charAt(i),0)-1);
            if(m.get(s2.charAt(i))==0){
                m.remove(s2.charAt(i));
            }
            m.put(s2.charAt(j),m.getOrDefault(s2.charAt(j),0)+1);
            i++;
            j++;
        }
            
        
       return map.equals(m);
    }
}
