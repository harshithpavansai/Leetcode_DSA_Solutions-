// class Solution {
//     public int findMiddleIndex(int[] nums) {
//         int[] p = new int[nums.length];
//         int[] s = new int[nums.length];
//         int n = nums.length-1;
//         p[0]=nums[0];
//         s[n]=nums[n];
//         for (int i = 1; i <= n; i++) {
//             p[i] = p[i - 1] + nums[i];
//         }
//         for (int i = n - 1; i >= 0; i--) {
//             s[i] = s[i + 1] + nums[i];
//         }
        
//         int left=0;
//         int right=0;

//         for(int i=0;i<n;i++){
//             if(i!=0){
//                 left=p[i-1];
//             }
//             if(i!=n-1){
//                 right=s[i+1];
//             }
//             else{
//                 right=0;
//             }
//             if(left==right){
//                 return i;
//             }
//         }
//          return -1;
//     }
// }



class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] p = new int[nums.length];
        int[] s = new int[nums.length];

        int n = nums.length - 1;
        p[0] = 0;
        for (int i = 1; i <= n; i++) {
            p[i] = p[i - 1] + nums[i - 1];
        }
        s[n] = 0;
        for (int i = n - 1; i >= 0; i--) {
            s[i] = s[i + 1] + nums[i + 1];
        }

        for (int i = 0; i <= n; i++) {
            if (p[i] == s[i]) {
                return i;
            }
        }

        return -1;
    }
}
