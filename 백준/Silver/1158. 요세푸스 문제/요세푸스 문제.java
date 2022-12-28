import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        Queue<Integer> q = new LinkedList<>();

        int T = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        sb.append("<");

        for(int i = 1; i <= T; i++ ){
            q.add(i);
        }
        while(q.size() > 1) {
            for(int i = 0; i < N - 1; i++){
                q.add(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }
        sb.append(q.poll()).append(">");
        System.out.println(sb);
        }
    }