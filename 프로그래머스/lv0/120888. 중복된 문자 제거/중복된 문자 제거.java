import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        List<Character> list = new ArrayList<>();
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if(!list.contains(c)) {
                answer += c;
                
                list.add(c);
            }
        }
        
        return answer;
    }
}