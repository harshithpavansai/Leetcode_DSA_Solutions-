class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] ar = new int[k];
        int idx = 0; 
        int j = 0; 

        for (int i = 1; idx < k; i++) { 
            if (j < arr.length && arr[j] == i) {
                j++;
            } else {
                ar[idx++] = i; 
            }
        }

        return ar[k - 1];
    }
}

