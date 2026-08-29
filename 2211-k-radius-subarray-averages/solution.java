class Solution {
    public int[] getAverages(int[] arr, int k) {
        if(k==0){
            return arr;
        }
         int n = arr.length;
        int[] nums = arr.clone();
        for(int i = k;i<n-k;i++){
            long sum=0;
            for(int j=i-k;j<=i+k;j++){
                
                sum+=nums[j];
            }
            arr[i]=(int)(sum/(2*k+1));
        }
       
        for(int i=0;i<n;i++){
            if(i<k||i>=n-k){
                arr[i]=-1;
            }
        }
        return arr;
    }
}
