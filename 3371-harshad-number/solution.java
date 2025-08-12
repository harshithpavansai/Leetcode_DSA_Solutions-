class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int res = -1;
        int temp=x;
        int sum=0;
        while(x!=0){
            int digit = x%10;
            sum+=digit;
            x/=10;
        }
        if(temp%sum==0) res = sum;
        return res;
        
    }
}
