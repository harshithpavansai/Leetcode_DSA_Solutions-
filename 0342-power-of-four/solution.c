bool isPowerOfFour(int n) {
    int res=0;
    if(n<=0)return 0;
    while(n%4==0){
        n/=4;
    }
     if(n==1){
            res=1;
        }
    return res;
}
