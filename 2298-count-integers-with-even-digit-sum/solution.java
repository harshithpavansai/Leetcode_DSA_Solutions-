class Solution {
    public int countEven(int num) {
        int cnt=0;
        for(int i=2;i<=num;i++){
            int c=0;
            int j=i;
            while(j!=0){
                c+=j%10;
                j/=10;
            }
            if(c%2==0)cnt++;
        }
        return cnt;
    }
}
