class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        
        for(int i = 0; i < nums.length; i++) {
            if(target == nums[i]) {
                arr[0] = i;
                break;
            }
        }
        
        if(arr[0] == -1) return arr;
        
        for(int i = arr[0]; i < nums.length; i++) {
            if(target == nums[i]) {
                arr[1] = i;
            } else {
                break;
            }
        }
        
        return arr;
    }
}


