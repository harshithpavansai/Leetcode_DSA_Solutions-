class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[2];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int pcnt=0;
        int rem=0;
        for(int value:map.values()){
            if(value%2!=0){
                rem++;
            }
            pcnt+=(value/2);
        }
        arr[0]=pcnt;
        arr[1]=rem;
        return arr;
    }
}
