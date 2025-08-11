class Solution {
    public int maxProduct(int n) {
        int[] arr = new int[10];
        int i=0;
        while(n!=0){
            int digit = n %10;
            arr[i]=digit;
            i++;
            n=n/10;
        }
        Arrays.sort(arr);
        int a =arr[arr.length-1];
        int b =arr[arr.length-2];
        int pro = a*b;
        return pro;

    }
}
