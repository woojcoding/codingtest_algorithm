import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String[] arr = my_string.toLowerCase().split("");
        
        Arrays.sort(arr);
        
        for (String s : arr) {
            answer += s;
        }
        
        return answer;
    }
}