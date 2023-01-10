import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
                q.add(Integer.parseInt(st.nextToken()));
            }
        }
        for (int j = 0; j < N - 1; j++) {
            q.poll();
        }
        System.out.println(q.poll());
    }
}