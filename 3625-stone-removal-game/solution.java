class Solution {
    public boolean canAliceWin(int n) {
        int k=10;
        int cnt=0;
        while(n>=k){
          
                n-=k;
                k--;
                cnt++;
            
        }
        return cnt%2!=0;
    }
}
