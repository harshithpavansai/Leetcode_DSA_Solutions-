int searchInsert(int* nums, int n, int target) {
    int count=0;
    for(int i=0;i<n;i++){
        if(target==nums[i]){
            count=2;
            return i;
                    }
    }
    if(count!=2){
        for(int i=0;i<n;i++){
            if(target<nums[i]){
                return i;
            }
        }
        if(target>nums[n-1]){
            return n;
        }
    }
    return -1;

}
