class Solution {
    public int minimumRecolors(String blocks, int k) {
        int cnt=0;
        int n = blocks.length();
        char[] arr = blocks.toCharArray();
        for(int i=0;i<k;i++){
            if(arr[i]=='W'){
                cnt++;
            }
        }
        int min = cnt;
        for(int i=k;i<n;i++){
            if(arr[i]=='W') cnt++;
            if(arr[i-k]=='W')cnt--;
            min = Math.min(cnt,min);
        }
        return min;
    }
}
