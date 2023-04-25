class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int width = brown + yellow;
        
        int x = 3;
        
        int y = width / x;
        
        while (true) {
            if (x >= y && x * y == width && 2 * (x + y) - 4 == brown) {
                break;
            }
            
            x++;
            
            y = width / x;
        }
        
        answer[0] = x;
        answer[1] = y;
            
        return answer;
    }
}