class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int l = i; l <= j; l++) {
            String num = String.valueOf(l);
            
            for (int m = 0; m < num.length(); m++) {
                if(num.charAt(m) == (char)(k + '0')) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}