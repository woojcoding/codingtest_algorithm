import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int pick = nums.length / 2;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i : nums) {
            map.put(i, 0);
        }
        
        return pick < map.size() ? pick : map.size();
    }
}