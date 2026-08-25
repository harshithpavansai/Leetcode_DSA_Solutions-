class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        
        while(left<=right){
            int temp=left;
           boolean flag=true;
            while(temp>0){
                int x = temp%10;
                if(x==0 || left%x!=0){
                    flag=false;
                    break;
                }
                temp/=10;
            }
            if(flag){
                list.add(left);
            }
            left++;
        }
        return list;
    }
}
