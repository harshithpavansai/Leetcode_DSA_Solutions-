class Solution {
    public String rearrangeString(String s, char x, char y) {
        char[] ch = s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(ch[i]==x){
                while(i<j && ch[j]==x){
                    j--;
                }
                char temp=ch[j];
                ch[j]=ch[i];
                ch[i]=temp;
                j--;
                i++;
            }
            else{
                i++;
            }
        }
        return new String(ch);
    }
}
