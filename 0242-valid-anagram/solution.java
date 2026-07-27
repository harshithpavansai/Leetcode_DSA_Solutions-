class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        int n1=s.length();
        int n2=t.length();
        if(n1!=n2) return false;
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<n1;i++){
            mp.put(arr1[i],mp.getOrDefault(arr1[i],0)+1);
        }
        for(int i=0;i<n2;i++){
            mp.put(arr2[i],mp.getOrDefault(arr2[i],0)-1);
        }
        System.out.println(mp);
        for(int i : mp.values()){
            if(i!=0){
                return false;
            }
        }
    return true;
    }
}
