class Solution {
    public List<Boolean> kidsWithCandies(int[] nums, int k) {
        List<Boolean> list = new ArrayList<>();
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int max = arr[nums.length-1];
       
        for(int i=0;i<nums.length;i++){
             boolean flag=false;
            if(nums[i]+k>=max) flag=true;
            list.add(flag);
        }
        return list;
    }
}
