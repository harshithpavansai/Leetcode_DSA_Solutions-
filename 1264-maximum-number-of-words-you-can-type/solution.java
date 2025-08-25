class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        char[] arr = brokenLetters.toCharArray();   
        String[] words = text.split(" ");           
        int count = 0;                             

        for (int i = 0; i < words.length; i++) {
            boolean canType = true;                 
            for (int j = 0; j < arr.length; j++) {
                if (words[i].indexOf(arr[j]) != -1) { 
                    canType = false;
                    break;
                }
            }
            if (canType) {
                count++;  
            }
        }
        return count;
    }
}

