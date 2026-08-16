class Solution {
    public int maxArea(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int area=Integer.MIN_VALUE;
        while(i<j){
            int a = (Math.min(nums[i],nums[j]))*(Math.abs(i-j));
            area=Math.max(area,a);
            if(nums[i]<nums[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return area;
    }
}
