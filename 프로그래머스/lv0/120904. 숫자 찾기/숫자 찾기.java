class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        
        String s = String.valueOf(num);
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.getNumericValue(c) == k) {
                return i + 1;
            }
        }
        return answer;
    }
}