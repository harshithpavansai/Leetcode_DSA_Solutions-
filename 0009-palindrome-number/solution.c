bool isPalindrome(int x) {
    int temp=x;
    long long int count=0;
    while(temp)
    {
        int last=temp%10;
        count=(count*10)+last;
        temp=temp/10;
    }
    if(x<0){
        return false;
    }
    if(count==x){
        return true;
    }
    else{
        return false;
    }
}
