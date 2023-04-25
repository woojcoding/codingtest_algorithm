import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        StringBuilder sb = new StringBuilder();        
        
        int n = sc.nextInt();
        
        int cnt = 1;
        
        while (n-- > 0) {
            for(int i = 0; i < cnt; i++) {
                sb.append("*");
            }
            
            sb.append("\n");
            
            cnt++;
        }
        
        System.out.println(sb.toString());
    }
}