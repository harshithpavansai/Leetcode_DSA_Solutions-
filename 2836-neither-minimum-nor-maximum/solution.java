class Solution {
    public int findNonMinOrMax(int[] nums) {
        int result;
        Arrays.sort(nums);
        if(nums.length>2)
        result=nums[1];
        else{
            result=-1;
        }

    return result;
    }
}
