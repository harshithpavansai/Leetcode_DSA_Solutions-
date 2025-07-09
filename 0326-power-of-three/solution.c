bool isPowerOfThree(int n) {
    int res=0;
    if(n==1){
        return 1;
    }
    if(n<=1)return res;
    while(n%3==0){
        n/=3;
        if(n==1)
         res=1;
    }
    return res;
}
