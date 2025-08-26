class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fc=0; // count of 5
        int tc=0; // count of 10

        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                fc++;
            }
            else if(bills[i]==10){
                fc--;
                tc++;
            }
            else { 
                if (tc > 0) {
                    tc--;
                    fc--;
                } else { 
                    fc -= 3;
                }
            }
            if(fc < 0 || tc < 0){
                return false;
            }
        }
        return true;
    }
}
