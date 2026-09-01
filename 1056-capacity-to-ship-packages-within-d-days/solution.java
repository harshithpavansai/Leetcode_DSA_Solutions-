class Solution {
    public boolean can_lift(int[] weights,int days,int minweight){
        int cnt=0;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]+sum<=minweight){
                sum+=weights[i];
            }
            else{
                cnt++;
                sum=weights[i];
            }
        }
        if(sum!=0){
            cnt++;
        }
        return cnt<=days;
    }
    public int find_min(int[] weights){
        int min=Integer.MIN_VALUE;
        for(int i=0;i<weights.length;i++){
            min=Math.max(min,weights[i]);
        }
        return min;
    }
     public int find_max(int[] weights){
        int max=0;
        for(int i=0;i<weights.length;i++){
            max+=weights[i];
        }
        return max;
    }

    public int shipWithinDays(int[] weights, int days) {
        int min=find_min(weights);
        int max=find_max(weights);
        int i=min;
        int j=max;
        while(i<j){
            int mid=(i+j)/2;
            if(can_lift(weights,days,mid)){
                j=mid;
            }
            else i=mid+1;
        }
        return i;
    }
}
