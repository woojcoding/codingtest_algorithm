class Solution {
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(0, 0, numbers, target);
            
        return answer;
    }
    
    public void dfs(int phase, int sum, int[] numbers, int target) {
        if (phase == numbers.length) {
            if (sum == target) {
                answer++;
            }
            
            return;
        }
        
        dfs (phase + 1, sum + numbers[phase], numbers, target);
            
        dfs (phase + 1, sum - numbers[phase], numbers, target);
    }
}