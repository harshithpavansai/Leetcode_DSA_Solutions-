class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer,Integer> m1 = new HashMap<>();
        HashMap<Integer,Integer> m2 = new HashMap<>();
        for(int i=0;i<matches.length;i++){
            m1.put(matches[i][0],m1.getOrDefault(matches[i][0],0)+1);
        }

        for(int i=0;i<matches.length;i++){
            m2.put(matches[i][1],m2.getOrDefault(matches[i][1],0)+1);
        }
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for(int i : m1.keySet()){
            if(!m2.containsKey(i)){
                l1.add(i);
            }
        }
        for(int i : m2.keySet()){
            if(m2.get(i) == 1){
                l2.add(i);
            }
        }

        Collections.sort(l1);
        Collections.sort(l2);

        list.add(l1);
        list.add(l2);
        return list;
    }
}
