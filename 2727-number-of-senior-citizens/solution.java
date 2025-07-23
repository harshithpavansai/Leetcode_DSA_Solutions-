class Solution {
    public int countSeniors(String[] details) {
        int cnt=0;
       for(int i=0;i<details.length;i++){
        String s=details[i];
        int x = s.charAt(11)-'0';
        int y = s.charAt(12)-'0';
        int age = (x*10)+y;
        if(age>60)cnt++;
       }
       return cnt;
    }
}
