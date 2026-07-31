class Solution {
    public int nthUglyNumber(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        int i2=0;
        int i3=0;
        int i5=0;
        for(int i=1;i<n;i++){
            int n2 = arr[i2]*2;
            int n3 = arr[i3]*3;
            int n5 = arr[i5]*5;
            int nm = Math.min(n2,Math.min(n3,n5));
            arr[i] = nm;
            if(nm == n2) i2++;
            if(nm == n3) i3++;
            if(nm == n5) i5++;
        }
        return arr[n-1];
    }
}
