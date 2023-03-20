class Solution {
    public int[] solution(int money) {
        int price = 5500;
        
        int ea = money / price;
        
        money -= price * ea;
        
        int[] answer = {ea, money};
        
        return answer;
    }
}