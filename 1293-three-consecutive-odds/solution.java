class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int result=0;
        for(int i=2;i<arr.length;i++){
            if(arr[i-2]%2!=0 && arr[i-1]%2!=0&&arr[i]%2!=0){
                result=1;
            }
        }
         return result==1;
    }
}
