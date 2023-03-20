class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int temp = n;
        
        while (temp > 0) {
            if (n % temp == 0) {
                answer++;
            } 
            
            temp--;
        }
        
        return answer;
    }
}