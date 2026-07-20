class Solution {
    public boolean judgeCircle(String moves) {
        char[] ch = moves.toCharArray();
        int ud=0;
        int sd=0;
        for(int i=0;i<moves.length();i++){
            if(ch[i]=='U'){
            ud++;
        }
        else if (ch[i]=='D'){
            ud--;
        }
        else if (ch[i]=='L'){
            sd++;
        }
        else{
            sd--;
        }
        }
    if(sd==0 && ud==0){
        return true;
    }
    return false;
        
    }
}
