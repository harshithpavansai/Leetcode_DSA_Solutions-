class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int cnt=0;
        int max=0;
        int grace=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cnt++;
            }
            else{
                grace++;
                cnt++;
            }
            while(grace>k){
                if(nums[left]==0){
                    grace--;
                }
                left++;
                cnt--;
            }
            max=Math.max(max,cnt);
        }
        return max;
    }
}
