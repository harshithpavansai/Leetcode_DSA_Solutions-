class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles; 
        int empty = numBottles;

        while (empty >= numExchange) {
            int newBottles = empty / numExchange; 
            int rem = empty % numExchange; 
            sum += newBottles;
            empty = newBottles + rem;
        }

        return sum;
    }
}
