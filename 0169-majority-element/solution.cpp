class Solution {
public:
    int majorityElement(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        if(nums.size() == 1) return nums[0];
     // 1 1 1 1 2 2 2
      int freq = 1;
      for(int i =1; i < nums.size();i++){
        if(nums[i] == nums[i-1]){
            freq++;
        }
        else{
            freq = 1;
        }
        if(freq > (nums.size())/2){
            return nums[i];
        }
      }
   return 0;
    }
};
