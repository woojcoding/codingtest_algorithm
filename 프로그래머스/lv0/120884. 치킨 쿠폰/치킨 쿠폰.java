class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        int coupon = chicken;
        
        while (coupon >= 10) {
            int temp = coupon / 10;
            
            coupon %= 10;
            
            answer += temp;
            
            coupon += temp;
        }
        
        return answer;
    }
}