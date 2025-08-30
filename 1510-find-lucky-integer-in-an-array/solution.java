import java.util.*;

class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int res = -1;
        int cnt = 1;
        
        for (int i = n - 1; i >= 0; i--) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                cnt++;
            } else {
                if (cnt == arr[i]) {
                    return arr[i]; 
                }
                cnt = 1; 
            }
        }
        
        return res;
    }
}
