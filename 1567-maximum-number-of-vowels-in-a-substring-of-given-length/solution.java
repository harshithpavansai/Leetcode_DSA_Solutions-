class Solution {
    public boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    public int maxVowels(String s, int k) {
        int cnt=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                cnt++;
            }
        }
        int max=cnt;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                cnt++;
            }
            if(isVowel(s.charAt(i-k))){
                cnt--;
            }
            max=Math.max(cnt,max);
        }
        return max;
    }
}
