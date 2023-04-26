import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] arr = s.toCharArray();
        
        Arrays.sort(arr);
        
        Map<Character,Integer> map = new HashMap<>();
        
        for (char c : arr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for (char c : arr) {
            if(map.get(c) == 1) {
                answer += c;
            }
        }
        
        return answer;
    }
}