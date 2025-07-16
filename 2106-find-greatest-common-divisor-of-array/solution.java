class Solution {
    public int findGCD(int[] nums) {
        int min=0;
        int max=0;
        Arrays.sort(nums);
        max=nums[nums.length-1];
        min=nums[0];
        int maxi=0;
        for(int i=1;i<=nums[0];i++){
            if(max%i==0 && min%i==0){
                    maxi=i;
            }
        }
        return maxi;
    }
}
