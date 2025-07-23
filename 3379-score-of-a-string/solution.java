class Solution {
    public int scoreOfString(String s) {
        int sum=0,k=0;
        for(int i=1;i<s.length();i++){
            if((int)s.charAt(i-1)>(int)s.charAt(i)){
                k=(int)s.charAt(i-1)-(int)s.charAt(i);
            }
            else{
                k=(int)s.charAt(i)-(int)s.charAt(i-1);
            }
            sum+=k;
        }
        return sum;
    }
}
