class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int cnt=i;
            for(int j=0;j<n/2;j++){
                int a = s.charAt((j+i)%n)-'a';
                int b = s.charAt((n-j+i-1)%n)-'a';

                int min = Math.abs(b-a);
                min=Math.min(min,26-min);
                cnt+=min;
            }
             ans=Math.min(ans,cnt);
        }
        return ans;
    }
}
