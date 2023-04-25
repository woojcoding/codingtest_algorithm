import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new LinkedList<>();
        
        for (int num : numlist) {
            if(num % n == 0) {
                list.add(num);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}