class Solution {
    public String triangleType(int[] nums) {
        int cnt=0;
        String res;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
            if(!(nums[0]+nums[1]>nums[2]&&nums[0]+nums[2]>nums[1]&&nums[1]+nums[2]>nums[0])){return "none";
            }
                if(nums[i]==nums[j])cnt++;
            
        }
        }
        if(cnt==3){
            res = "equilateral";
        }
        else if(cnt==1){
            res = "isosceles";
        }
        else{
            res = "scalene";
        }
        return res;
        
    }
}
