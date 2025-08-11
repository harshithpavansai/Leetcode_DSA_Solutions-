class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int rounded = (purchaseAmount % 10 >= 5) 
                        ? purchaseAmount + (10 - purchaseAmount % 10): purchaseAmount - (purchaseAmount % 10);
        return 100 - rounded;
    }
}

