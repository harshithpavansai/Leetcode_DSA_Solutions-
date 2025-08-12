class Solution {
    public double largestTriangleArea(int[][] points) {
        double maxArea = 0.0;
        int n = points.length;

        // Iterate through all possible combinations of three points
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                   //calculate area
                double area = calculateArea(points[i],points[j],points[k]);
                    // Update the maximum area
                    if (area > maxArea) {
                        maxArea = area;
                    }
                }
            }
        }
        return maxArea;
    }
    private double calculateArea(int[] a, int[] b, int[] c) {
        return 0.5 * Math.abs(
            a[0] * (b[1] - c[1]) +
            b[0] * (c[1] - a[1]) +
            c[0] * (a[1] - b[1]));
}
}
