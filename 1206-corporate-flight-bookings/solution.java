class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] arr = new int[n+1];
       
        for(int[] a : bookings){
            arr[a[0]-1]+=a[2];
            arr[a[1]]+=(a[2]*-1);
        }
        int[] ans= new int[n];
        ans[0]=arr[0];
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]+arr[i];
        }
        
        return ans;
    }
}
