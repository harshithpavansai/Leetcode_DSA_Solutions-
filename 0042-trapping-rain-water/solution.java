class Solution {
    public int trap(int[] h) {
        int l=0;
        int r=h.length-1;
        int lm=0;
        int rm=0;
        int water=0;
        while(l<r){
            if(h[l]<=h[r]){
                if(h[l]>=lm){
                    lm=h[l];
                }
                else{
                    water+=lm-h[l];
                }
                l++;
            }
            else{
                if(h[r]>=rm){
                    rm=h[r];
                }
                else{
                    water+=rm-h[r];
                }
                r--;
            }
        }
        return water;

    }
}
