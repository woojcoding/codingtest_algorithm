class Solution {
    public int solution(int n) {
        int answer = 1;
        
        int temp = 1;
        
        while (true) {
            temp *= answer;
            
            if (temp * answer > n) {
                break;
            } else if (temp * answer == n) {
                return answer;
            } 
            
            answer++;
        }
        return answer--;
    }
}