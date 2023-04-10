import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            q.add((int)Math.ceil((100.0 - progresses[i]) / speeds[i]));
        }
        
        while (!q.isEmpty()) {
            int day = q.poll();
            
            int cnt = 1;
            
            while (!q.isEmpty() && day >= q.peek()) {
                q.poll();
                
                cnt++;
            }
            
            list.add(cnt);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}