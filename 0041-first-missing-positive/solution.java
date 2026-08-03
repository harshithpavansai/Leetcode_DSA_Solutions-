class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
            
        }
        int num=1;
        while(true){
            if(map.contains(num))num++;
            else return num;
        }
    }
}
