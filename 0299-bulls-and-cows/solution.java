// class Solution {
//     public String getHint(String s, String g) {
//         char[] a = s.toCharArray();
//         char[] b = g.toCharArray();
//         int cows=0;
//         int bulls = 0;

//         HashMap<Character,Integer> m1 = new HashMap<>();
//         HashMap<Character,Integer> m2 = new HashMap<>();

//         for (int i = 0; i < s.length(); i++) {
//             char st = s.charAt(i);
//             char gu = g.charAt(i);

//             if (st == gu) {
//                 bulls++;
//             } else {
//                 m1.put(st, m1.getOrDefault(s, 0) + 1);
//                 m2.put(gu, m2.getOrDefault(g, 0) + 1);
//             }
//         }
//         for(char i :m1.keySet()){
//             if(m2.containsKey(i)){
//                 cows+=Math.min(m1.get(i),m2.get(i));
//             }
//         }

//         // char[] ans = new char[4];
//         // ans[1]='A';
//         // ans[3]='B';
//         // ans[2]=bulls;
//         // ans[0]=cows;
//          return bulls + "A" + cows + "B";


        



//     }
// }
import java.util.*;

class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;

        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();

        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);

            if (s == g) {
                bulls++;
            } else {
                m1.put(s, m1.getOrDefault(s, 0) + 1);
                m2.put(g, m2.getOrDefault(g, 0) + 1);
            }
        }

        for (char ch : m1.keySet()) {
            if (m2.containsKey(ch)) {
                cows += Math.min(m1.get(ch), m2.get(ch));
            }
        }

        return bulls + "A" + cows + "B";
    }
}
