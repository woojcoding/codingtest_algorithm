import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        for (int[] arr : sizes) {
            Arrays.sort(arr);
        }
        
        int x = 0;
        
        int y = 0;
        
        for(int[] arr : sizes) {
            if(arr[0] > x) {
                x = arr[0];
            }
            
            if(arr[1] > y) {
                y = arr[1];
            }
            
        }
        
        return x * y;
    }
}