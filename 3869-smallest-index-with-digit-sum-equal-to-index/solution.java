class Solution {
    static boolean digitsum(int[] nums,int i){
        int sum=0;
            while(nums[i]>0){
                sum+=nums[i]%10;
                nums[i]=nums[i]/10;
            }
            return sum==i;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(digitsum(nums,i)){
                return i;
            }
            }
            
        return -1;
    }
}
