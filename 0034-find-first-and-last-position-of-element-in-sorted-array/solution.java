class Solution {
    public int[] searchRange(int[] nums, int target) {

        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        
        int fi=-1;
        int li=-1;
        int l = 0;
        int r = nums.length-1;
        int mid=0;
        while(l<r){
            mid = l+(r-l)/2;
            if(nums[mid]==target){
                fi=mid;
                r = mid;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        if(nums[l]==target){
            fi=l;
        }
        li=fi;
        int i=fi;
        int j=nums.length-1;
        if (fi == -1) {
            return new int[]{-1, -1};
        }
        while(i<j){
            int miid = i+(j-i)/2;
            if(nums[miid]==target){
                li=miid;
                i=miid+1;
            }
            else if(nums[miid]>target){
                j=miid;
            }
            else{
                i=miid+1;
            }
        }
        if(nums[i]==target)
        li=i;
        
        return new int[]{fi,li};
    }
}


