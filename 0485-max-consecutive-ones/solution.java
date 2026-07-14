class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int oc=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                oc++;
            }
            else{
                max=Math.max(max,oc);
                oc=0;
            }
        }
        return Math.max(max,oc);
    }
}
