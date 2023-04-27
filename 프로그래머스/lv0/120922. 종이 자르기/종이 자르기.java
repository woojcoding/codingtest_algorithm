class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        
        int paper = 1;
        
        if (M != 1) {
            answer += paper * (M - 1);
            
            paper += M - 1;
        }
        
        if (N != 1) {
            answer += paper * (N - 1);
        }
        
        return answer;
    }
}