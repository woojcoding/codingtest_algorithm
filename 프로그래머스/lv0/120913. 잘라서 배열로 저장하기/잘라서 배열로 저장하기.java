import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();
        
        int repeat = my_str.length() / n;
        
        if (my_str.length() % n != 0) {
            repeat++;
        }
        
        int cnt = 0;
        
        while (repeat-- > 0) {
            if (repeat == 0) {
                 list.add(my_str.substring(cnt));
            } else {
                list.add(my_str.substring(cnt, cnt + n));
            }

            cnt += n;
        }
        
        String[] answer = new String[list.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}