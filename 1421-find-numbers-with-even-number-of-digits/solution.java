class Solution {
    static boolean digitsno(int[] nums,int i){
        int count=0;
        while(nums[i]>0){
            nums[i]/=10;
            count++;
        }
        return count%2==0;
    }
    public int findNumbers(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(digitsno(nums,i)) cnt++;
        }
        return cnt;
    }
}
