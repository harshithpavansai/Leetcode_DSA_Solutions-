class Solution {
    public int findMin(int[] nums) {
        // if(arr.length==2){
        //     if(arr[0]<arr[1]) return arr[0];
        //     else return arr[1];
        // }
        // if(arr[0]<arr[arr.length-1]){
        //     return arr[0];
        // }
        // else{
        //     int x = arr[0]-arr[arr.length-1];
        //     return arr[arr.length-1]-x;
        // }
        // int i=0;j=nums.length-1;
        // int mid = i+(j-i)/2;
        // while(i<=j){
        //     if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
        //         return nums[mid];
        //     }
        //     if(nums[mid] > nums[mid-1] && nums[mid] < nums[mid+1]){
        //         i = mid;
        //     }
        //     if(nums[mid] < nums[mid-1] && nums[mid] > nums[mid+1]){
        //         j = 
        //     }
        // }

        Arrays.sort(nums);
        return nums[0];
    }
}
