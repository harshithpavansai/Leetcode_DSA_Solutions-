class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int cnt=0;
        int n=fruits.length;
        int m=baskets.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(fruits[i]<=baskets[j]){
                    cnt++;
                    baskets[j]=0;
                    break;
                }

            }
        }
        return fruits.length-cnt;
    }
}
