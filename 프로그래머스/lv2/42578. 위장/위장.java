import java.util.*;

class Solution {
    public int solution(String[][] clothes) { 
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for (String[] arr : clothes) {
            map.put(arr[1], map.getOrDefault(arr[1], 0) + 1);
        }
        
        int answer = 1;

        for (String s : map.keySet()) {
            answer *= map.get(s) + 1;   
        }
        return answer - 1;
    }
}