class Solution {
    public void reverseString(char[] s) {
        // char arr[] = new char[s.length];
        // for (int i = s.length - 1, j = 0; i >= 0; i--, j++) {
        //     arr[j] = s[i];
        // }
        // for (int i = 0; i < s.length; i++) {
        //     s[i] = arr[i];
        // }
        int n = s.length;
        for(int i=0;i<n/2;i++){
            char temp=s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=temp;
        }
        
    }
}
