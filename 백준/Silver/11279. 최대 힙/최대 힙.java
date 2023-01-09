import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Object> q = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine()); // 연산의 개수

        for (int i =0; i < N; i++) {

            int t = Integer.parseInt(br.readLine());

            if( t == 0) {
               if(q.isEmpty()) {
                   sb.append(0).append('\n');
               }
               else {
                   sb.append(q.poll()).append('\n');
               }
           } else {
               q.add(t);
           }
        }
        System.out.println(sb);
    }
}