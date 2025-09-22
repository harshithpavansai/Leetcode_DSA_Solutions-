class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int a = nums[nums.length-1];
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=a+i;
        }
    return sum;
    }
}
