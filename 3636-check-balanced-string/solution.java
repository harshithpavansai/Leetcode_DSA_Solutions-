class Solution {
    public boolean isBalanced(String num) {
        int sum1=0;
        int sum2=0;
        char[] arr = num.toCharArray();
        for(int i=0;i<arr.length;i++){
            int digit = arr[i] - '0';
            if(i%2==0){
                sum1+=digit;
            }
            else{
                sum2+=digit;
            }
        }
        return sum1==sum2;
    }
}
