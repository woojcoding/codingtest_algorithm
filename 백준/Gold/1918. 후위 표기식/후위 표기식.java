import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();// 예제 입력
        Stack<Character> stack = new Stack<>();

        for (int i =0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) { // 대문자인 경우 그냥 출력
                sb.append(c);
            }
            else if(c == '(') { // '(' 는 그냥 스택에 넣음.
                stack.add('(');
            }
            else if (c == ')') { // ')' 인 경우 '(' 나올 때까지 스택에서 빼서 출력 // '('는 출력하지 X
                while(stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop();
            }
            else if (c == '*'|| c == '/')  {  // 우선순위가 같다면 출력
                while (!stack.isEmpty() &&(stack.peek() == '*' || stack.peek() == '/')) {
                    sb.append(stack.pop());
                }
                stack.add(c);
            }
            else if (c == '+' || c == '-') { // 우선순위가 높거나 같다면 출력
                while(!stack.empty() && (stack.peek() == '*' || stack.peek() == '/' || stack.peek() == '+' || stack.peek() == '-')) {
                    sb.append(stack.pop());
                }
                stack.add(c);
            }
        }
        while (!stack.isEmpty()) { //스택 남은 것 전부 출력
            sb.append(stack.pop());
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}