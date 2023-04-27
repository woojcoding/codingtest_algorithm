import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
    
        List<Integer> list = new ArrayList<>();
        
        for (int num : emergency) {
            list.add(num);
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.indexOf(emergency[i]) + 1;
        }
        
        return answer;
    }
}