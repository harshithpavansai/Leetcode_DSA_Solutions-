class Solution {
    public boolean checkOnesSegment(String s) {
        int n = s.length();
        int cnt=0;
        int flag=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1' && flag==0){
                cnt++;
            }
            if(s.charAt(i)=='0' && cnt!=0){
                flag++;
            }
            if(s.charAt(i)=='1' && flag!=0){
                return false;
            }
        }
        return true;

        
    }
}
