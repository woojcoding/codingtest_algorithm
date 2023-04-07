class Solution {
    static boolean visited[];
    
    static int answer = 0;
    
    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                answer++;
                
                dfs(i, computers);
            }
        }
        
        return answer;
    }
    
    public void dfs(int idx, int[][] computers) {
        visited[idx] = true;
        
        for (int j = 0; j < visited.length; j++) {
            if (visited[j] == false && computers[idx][j] == 1) {
                dfs(j, computers);
            }
        }
    }
}