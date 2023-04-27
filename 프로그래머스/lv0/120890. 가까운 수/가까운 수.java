import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        int min = Integer.MAX_VALUE;
        
        Integer[] arr = Arrays.stream(array).boxed().toArray(Integer[]::new);
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        for (int num : arr) {
            if (Math.abs(num - n) <= min) {
                min = Math.abs(num - n);
                
                answer = num;
            }
        }
        
        return answer;
    }
}