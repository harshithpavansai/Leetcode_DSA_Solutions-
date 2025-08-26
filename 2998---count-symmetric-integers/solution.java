class Solution {
    boolean isSymmetric(int n,int cnt){
        int count=cnt/2;
        int mul=1;
       for (int i = 0; i < count; i++) {
        mul *= 10; 
    }
    int r = n % mul;
    int l = n / mul;
        int ls=0;
        int rs=0;
        while(r!=0||l!=0){
            ls+=l%10;
            l/=10;
            rs+=r%10;
            r/=10;
        }
        if(ls==rs){
            return true;
        }
        else{
            return false;
        }
    }
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++){
           int cnt=0;
           int x=i;
           while(x!=0){
            cnt++;
            x/=10;
            }
            if(cnt%2==0){
                if(isSymmetric(i,cnt)){
                    c++;
                }
            }
        
    
        }
        return c;
    }
}
