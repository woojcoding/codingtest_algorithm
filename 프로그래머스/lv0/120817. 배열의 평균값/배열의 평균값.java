class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        
        double temp = 0;
        
        for (int num : numbers) {
            temp += num;
        }
        
        answer = temp / numbers.length;
        return answer;
    }
}