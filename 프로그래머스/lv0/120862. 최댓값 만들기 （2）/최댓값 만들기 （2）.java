import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        
        int size = numbers.length;
        
        if(numbers[0] * numbers[1] > numbers[size - 1] * numbers[size - 2]) {
            return numbers[0] * numbers[1];
        } else {
            return numbers[size - 1] * numbers[size - 2];
        }
    }
}