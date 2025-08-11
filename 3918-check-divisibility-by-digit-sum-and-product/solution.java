class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int dsum=0;
        int dpro=1;
        while(n!=0){
            int digit = n%10;
            dsum+=digit;
            dpro*=digit;
            n/=10;
        }
        int sum = dsum+dpro;
        if(temp%sum==0){
            return true;
        }
        else {
            return false;
        }
    }
}
