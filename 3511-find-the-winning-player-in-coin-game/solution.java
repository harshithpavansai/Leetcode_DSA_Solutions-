class Solution {
    public String winningPlayer(int x, int y) {
    int m = Math.min(x, y / 4);
    return (m % 2 == 0) ? "Bob" : "Alice";
    }
}
