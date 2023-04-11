import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Doc> q = new LinkedList<>();
        
        int idx = 0;
        
        for (int val : priorities) {
            q.add(new Doc(idx, val));
            
            idx++;
        }
        
        while (!q.isEmpty()) {
            int val = q.peek().val;
            
            boolean canNotPrint = false;
            
            for (Doc doc : q) {
                if (val < doc.val) {
                    canNotPrint = true;
                    
                    break;
                }
            }
            
            if (canNotPrint) {
                Doc doc = q.poll();
                
                q.add(doc);
                }
            
            else {
                Doc doc = q.poll();
                
                answer++;
                
                if(doc.idx == location) {
                    return answer;
                }
            }
        }
        return answer;
    }

    class Doc {
        int idx;
        
        int val;
        
        public Doc(int idx, int val) {
            this.idx = idx;
            
            this.val = val;
        }
    }
}