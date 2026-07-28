class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        int sum=0;
        int cnt=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        if(sum/k>=threshold){
                cnt++;
            }
        for(int i=k;i<nums.length;i++){
            sum = sum + nums[i] - nums[i-k];
            if(sum/k>=threshold){
                cnt++;
            }
        }
    return cnt;
    }
}
