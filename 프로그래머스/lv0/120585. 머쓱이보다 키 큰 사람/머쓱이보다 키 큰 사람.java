class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        for (int friendHeight : array) {
            if (friendHeight > height) {
                answer++;
            }
        }
        
        return answer;
    }
}