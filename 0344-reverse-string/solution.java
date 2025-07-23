class Solution {
    public void reverseString(char[] s) {
        char arr[] = new char[s.length]; // Temporary array

        // First loop: copy characters from s[] to arr[] in reverse order
        for (int i = s.length - 1, j = 0; i >= 0; i--, j++) {
            arr[j] = s[i];
        }

        // Second loop: copy reversed characters back to s[]
        for (int i = 0; i < s.length; i++) {
            s[i] = arr[i];
        }
    }
}
