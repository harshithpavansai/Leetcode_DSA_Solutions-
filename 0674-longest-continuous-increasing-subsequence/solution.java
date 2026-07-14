class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int ic=1;
        int max=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                max++;
            }
            else{
                ic=Math.max(max,ic);
                max=1;
            }
        }
        return Math.max(ic,max);
    }
}
