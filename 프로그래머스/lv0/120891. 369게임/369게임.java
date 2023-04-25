class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String s = String.valueOf(order);
        
        for (int j = 0; j < s.length(); j++) {
            char num = s.charAt(j);
                
            if (num == '3' || num == '6' || num == '9') {
                answer++;
            }
        }
        
        return answer;
    }
}