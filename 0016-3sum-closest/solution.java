class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum=100000;
        int i=0;
        int n = nums.length;
        for(i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int ts=nums[i]+nums[j]+nums[k];
                if(Math.abs(ts - target) < Math.abs(sum - target)){
                    sum = ts;
                }
                if(ts < target){
                    j++;
                }
                else if(ts > target){
                    k--;
                }
                else{
                    return ts;
                }
            }
        }
        return sum;
    }
}
