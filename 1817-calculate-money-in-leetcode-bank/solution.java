class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int cnt = 0;  
        int j = 0;  
        int i = 1; 

        int days = 0; 

        while (days < n) {
            sum += i + j;
            cnt++;
            i++;
            days++;

            if (cnt == 7) {
                j++;
                cnt = 0;
                i = 1;
            }
        }

        return sum;
    }
}
