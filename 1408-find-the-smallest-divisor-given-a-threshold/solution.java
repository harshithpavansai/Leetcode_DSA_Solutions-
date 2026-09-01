class Solution {
    public boolean crt(int[] nums,int threshold,int k){
        int sum=0;
        for(int i=0;i<nums.length;i++){
             sum+= (nums[i] + k - 1) / k;
        }
        return sum<=threshold;
    }
    public int max(int[] nums){
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        return max;
    }
    public int smallestDivisor(int[] nums, int threshold) {
         int i=1;
        int j=max(nums);
        while(i<j){
            int mid = (i+j)/2;
            if(crt(nums,threshold,mid)){
                j=mid;
            }
            else{
                i=mid+1;
            }
        }
        return i;
    }
}
