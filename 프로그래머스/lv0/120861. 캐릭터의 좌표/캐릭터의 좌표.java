class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        int limitX = board[0] / 2;
        int limitY = board[1] / 2;
        
        for (String s : keyinput) {
            switch (s) {
                   case "left":
                    answer[0]--;
                    
                    if (answer[0] < limitX * -1) {
                        answer[0]++;
                    }
                    
                    break;
                case "right":
                    answer[0]++;
                    
                    if (answer[0] > limitX) {
                        answer[0]--;
                    }
                    
                    break;
                case "down":
                    answer[1]--;
                    
                    if (answer[1] < limitY * -1) {
                        answer[1]++;
                    }
                    
                    break;
                case "up":
                    answer[1]++;
                    
                    if (answer[1] > limitY) {
                        answer[1]--;
                    }
                    
                    break; 
            }          
        }
        
        return answer;
    }
}