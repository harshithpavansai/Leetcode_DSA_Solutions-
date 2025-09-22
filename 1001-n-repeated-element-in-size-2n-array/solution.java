class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length/2;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            int cnt=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j])cnt++;
            }
            if(cnt==n){
                temp=nums[i];
            }
        }
        return temp;
    }
}
