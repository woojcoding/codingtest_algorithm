class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        int max = 0;
        
        int[] cnt = new int[1001];
        
        for (int i : array) {
            cnt[i]++;
        }
        
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > max) {
                max = cnt[i];
                
                answer = i;
            }
        }
        
        int count = 0;
        
        for (int i : cnt) {
            if (i == max) {
                count++;
            }
            
            if (count >= 2) {
                return -1;
            }
        }
        
        return answer;
    }
}