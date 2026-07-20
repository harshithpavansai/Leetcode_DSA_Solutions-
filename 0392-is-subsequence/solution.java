class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        int flag=0;
        while(i<s.length() && j<t.length()){
            if(c1[i]==c2[j]){
                flag++;
                i++;
                j++;
            }
            else{
                j++;
            }

        }
        return flag==s.length();
    }
}
