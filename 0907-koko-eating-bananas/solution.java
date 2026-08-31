class Solution {
    public boolean can_eat(int[] piles,int h,int k){
        long hours=0;
        for(int i=0;i<piles.length;i++){
            hours += (piles[i] + k - 1) / k;
        }
        return hours<=h;

    }
    public int get_max(int[] piles){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max=Math.max(piles[i],max);
        }
        return max;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int i=1;
        int j=get_max(piles);
        while(i<j){
            int mid = (i+j)/2;
            if(can_eat(piles,h,mid)){
                j=mid;
            }
            else{
                i=mid+1;
            }
        }
        return i;
    }
}
