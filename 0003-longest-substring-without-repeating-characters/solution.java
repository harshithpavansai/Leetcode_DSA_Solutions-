class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int max=0;
        int cnt=0;

        HashSet<Character> set = new HashSet<>();

        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
                cnt--;
            }
            set.add(s.charAt(i));
            cnt++;
            max = Math.max(max,cnt);
        }
        return max;
    }
}
