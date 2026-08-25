class Solution {
    public boolean is_letter(char ch){
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
    }
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int i=0;
        int j = arr.length-1;
        while(i<j){
            while(i<j && !is_letter(arr[i]))i++;
            while(i<j && !is_letter(arr[j]))j--;

            char temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        
        return new String(arr);
    }
}
