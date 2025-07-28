class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        for(int i=0,j=0;i<n&&j<nums.length;i++,j+=2){
            arr[j]=nums[i];
        }
        for(int i=n,j=1;i<nums.length&&j<nums.length;i++,j+=2){
            arr[j]=nums[i];

        }
        return arr;
    }
}
