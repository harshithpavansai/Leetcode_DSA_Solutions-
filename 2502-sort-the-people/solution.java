class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
       for(int i=0;i<heights.length;i++){
        for(int j=i+1;j<heights.length;j++){
            if(heights[i]<heights[j]){
                int temp = heights[j];
                heights[j] = heights[i];
                heights[i]=temp;
                String name=names[j];
                names[j]=names[i];
                names[i]=name;
            }
        }
       }
       return names;
    }
}
