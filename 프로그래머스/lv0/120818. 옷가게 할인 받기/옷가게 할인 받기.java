class Solution {
    public int solution(int price) {
        double percent = 1.0;
        
        if (price >= 500000) {
            percent = 0.8;
        } else if (price >= 300000) {
            percent = 0.9;
        } else if (price >= 100000) {
            percent = 0.95;
        } 
        
        return (int)(price * percent);
    }
}