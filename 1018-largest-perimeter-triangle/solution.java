class Solution {
    boolean isvalid(int a,int b,int c){
        if(a+b>c&&a+c>b&&b+c>a){
            return true;
        }
        else{
            return false;
        }
    }
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
         for (int i = nums.length - 1; i >= 2; i--) {
            int a = nums[i], b = nums[i-1], c = nums[i-2];
            if (isvalid(a, b, c)) {
                return a + b + c; 
            }
        }
        return 0;
        
    }
}
