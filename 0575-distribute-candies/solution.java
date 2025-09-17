class Solution {
    public int distributeCandies(int[] candyType) {
        int cnt=1;
        int temp=0;
        Arrays.sort(candyType);
        for(int i=1;i<candyType.length;i++){
            if(candyType[i-1]!=candyType[i])cnt++;
        }
        if(cnt>(candyType.length)/2){
            return candyType.length/2;
        }
        return cnt;
    }
}
