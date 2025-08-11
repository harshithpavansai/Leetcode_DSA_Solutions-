class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int a = maxWeight/w;
        if(n*n<a){
            return n*n;
        }
        else{
            return a;
        }
        
    }
}
