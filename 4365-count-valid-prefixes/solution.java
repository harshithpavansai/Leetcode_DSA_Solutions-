class Solution {
    public int countValidPrefixes(String s) {
        int z=0;
        int o=0;
        int res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0')z++;
            if(s.charAt(i)=='1')o++;
            if(Math.abs(z-o)<=1)res++;
        }
        return res;
    }
}
