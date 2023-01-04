import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        String s = br.readLine();

        int cnt = 0;
        char before = ' ';

        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.add('(');
                before = '(';
            } else {
                stack.pop();
                if(before == '(') {
                    cnt += stack.size();
                } else {
                    cnt++;
                }
                before = ')';
            }
        }
        System.out.println(cnt);
    }
}