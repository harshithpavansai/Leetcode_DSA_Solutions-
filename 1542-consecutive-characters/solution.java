class Solution {
    public int maxPower(String s) {
        char[] arr = s.toCharArray();
        if(arr.length==1){
            return 1;
        }
        int max=0;
        int cnt=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]) cnt++;
            
            else{
                cnt=1;
            }
            max=Math.max(cnt,max);
        }
        return max;
    }
}
