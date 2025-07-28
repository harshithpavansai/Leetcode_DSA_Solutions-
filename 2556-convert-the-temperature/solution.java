class Solution {
    public double[] convertTemperature(double celsius) {
        double[] arr = new double[2];
        arr[0]=celsius+273.15;
         double f=(celsius*1.8)+32;
         arr[1]=f;
         return arr;
    }
}
