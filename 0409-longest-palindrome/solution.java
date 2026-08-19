class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1){
            return 1;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int cnt=0;
        for(int i : map.values()){
            if(i%2!=0){
                cnt+=i-1;
            }
            else{
                cnt+=i;
            }
        }
        for(int i: map.values()){
            if(i%2!=0){
                cnt++;
                break;
            }
        }
        return cnt;
    }
}
