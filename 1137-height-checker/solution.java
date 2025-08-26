class Solution {
    public int heightChecker(int[] heights) {
        int cnt=heights.length;
        int[] arr = heights.clone();
        Arrays.sort(arr); 
        for(int i=0;i<heights.length;i++){
            if(arr[i]==heights[i]) cnt--;
        }
        return cnt;
    }
}
