import java.util.*;

class Solution {
    public int solution(String before, String after) {
        String[] beforeArr = before.split("");
        Arrays.sort(beforeArr);
        before = Arrays.toString(beforeArr);
        
        String[] afterArr = after.split("");
        Arrays.sort(afterArr);
        after = Arrays.toString(afterArr);
        
        if (before.equals(after)) {
            return 1;
        } else {
            return 0;
        }
    }
}