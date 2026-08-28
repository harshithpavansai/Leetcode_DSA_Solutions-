// class Solution {
//     public List<Integer> findAnagrams(String s, String p) {
//         List<Integer> list = new ArrayList<>();
//         if (p.length() > s.length()) {
//             return list;
//         }
//         HashMap<Character,Integer> map = new HashMap<>();
        
//         for(int i=0;i<p.length();i++){
//             map.put(p.charAt(i),map.getOrDefault(p.charAt(i),0)+1);
//         }
//         for (int i = 0; i <= s.length() - p.length(); i++) {

//             HashMap<Character, Integer> temp = new HashMap<>(map);

//             for (int j = i; j < i + p.length(); j++) {
//                 char ch = s.charAt(j);

//                 if (!temp.containsKey(ch)) {
//                     break;
//                 }

//                 temp.put(ch, temp.get(ch) - 1);

//                 if (temp.get(ch) == 0) {
//                     temp.remove(ch);
//                 }
//             }

//             if (temp.isEmpty()) {
//                 list.add(i);
//             }
//         }
//         return list;
        
//     }
// }
class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();

        if (p.length() > s.length()) {
            return list;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> window = new HashMap<>();

        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            window.put(ch, window.getOrDefault(ch, 0) + 1);
            if (right - left + 1 > p.length()) {
                char remove = s.charAt(left);

                window.put(remove, window.get(remove) - 1);

                if (window.get(remove) == 0) {
                    window.remove(remove);
                }

                left++;
            }
            if (right - left + 1 == p.length() && window.equals(map)) {
                list.add(left);
            }
        }

        return list;
    }
}


