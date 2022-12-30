import java.io.*;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        // 반복수
        int t = Integer.parseInt(br.readLine());
        //시작점
        int start = 0;

        // 처음 읽은 값만큼 반복한다.
        for(int i = 0; i < t; i++){

            int value = Integer.parseInt(br.readLine());
            // value보다 작다면 value까지 스택에 push를 해준다.
            if(value > start) {
                for(int j = start + 1; j <= value; j++) {
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                start = value;
                // 스택의 peek과 같지 않다면 peek이 value보다 큰 경우이므로 오름차순 조건 불충족
            } else if (stack.peek() < value) {
                System.out.println("NO");
                return;
            }
            // 스택의 peek이 value 이므로 이를 pop 해준다.
            stack.pop();
                sb.append("-").append("\n");


        }
        System.out.println(sb);
    }
}