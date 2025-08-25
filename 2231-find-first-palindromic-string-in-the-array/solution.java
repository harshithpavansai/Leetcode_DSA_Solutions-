class Solution {
private boolean isPalindrome(String s){
    String s1 = new StringBuilder(s).reverse().toString();
   return s1.equals(s);
}

    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(isPalindrome(words[i])){
                return words[i];
            }
        }
        return "";
    }
}
// ------------------------------------------------------------------------------
// class Solution {
//     private boolean isPalindrome(String s) {
//         String s1 = new StringBuilder(s).reverse().toString();
//         return s1.equals(s);
//     }

//     public String firstPalindrome(String[] words) {
//         for (int i = 0; i < words.length; i++) {
//             if (isPalindrome(words[i])) {
//                 return words[i];
//             }
//         }
//         return "";
//     }
// }

