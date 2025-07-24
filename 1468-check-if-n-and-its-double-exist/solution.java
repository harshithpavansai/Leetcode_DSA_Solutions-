class Solution {
    public boolean checkIfExist(int[] arr) {
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==2*arr[j]||arr[j]==2*arr[i]){
                    k=1;
                break;
                }
            }
        }
        return k==1;
    }
}
