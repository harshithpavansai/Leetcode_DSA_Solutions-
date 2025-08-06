class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int result=0;
        Arrays.sort(nums);
        for(int i=1;i<=n;i++){
            if(nums[i-1]!=i){
                result=i;
            }
        }
        return result;
    }
}
