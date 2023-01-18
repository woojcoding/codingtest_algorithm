import java.io.*;
import java.util.*;
class Tops {
    int idx;
    int height;

    public Tops(int idx, int height) {
        this.idx = idx;
        this.height = height;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());// 탑의 수

        Stack<Tops> stack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            Tops top = new Tops(i + 1,Integer.parseInt(st.nextToken()));
            while(!stack.isEmpty()) {
                if(top.height >stack.peek().height) {
                    stack.pop();
                } else {
                    sb.append(stack.peek().idx).append(" ");
                    break;
                }
            } if(stack.isEmpty()) {
                sb.append(0).append(" ");
            }
            stack.push(top);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}