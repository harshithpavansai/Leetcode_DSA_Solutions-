class Solution {
    public int totalFruit(int[] fruits) {
       int left=0;
       int cnt=0;
       int max=0;
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<fruits.length;i++){
        map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
        cnt++;
        while(map.size()>2){
            map.put(fruits[left], map.get(fruits[left]) - 1);
            if(map.get(fruits[left])==0){
                map.remove(fruits[left]);  
            }
            left++;
            cnt--;
        }
        max=Math.max(max,cnt);
       }
       return max;
    }
}
