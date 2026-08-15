class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int sum=0;
        int p=0;
        for(int i=0;i<requests.length;i++){
            if(requests[i]<=n){
                sum+=Math.abs(p-requests[i]);
                 p=requests[i];
            }
               
        }
        return sum;
    }
}
