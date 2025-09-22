class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int min = Math.min(nums1[0],nums2[0]);
        int max = Math.max(nums1[0],nums2[0]);
        int result = (min*10)+max;
        int temp = Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j])
                temp =Math.min(temp,nums1[i]);
            }
        }
        if(temp==0){
            return result;
        }
        return Math.min(result,temp);
    }
}
