import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        List<String> list = Arrays.asList(morse);
        
        String[] arr = letter.split(" ")
        
        for (String s : arr) {
            answer += (char) (list.indexOf(s) + 97);
        }
        
        return answer;
    }
}