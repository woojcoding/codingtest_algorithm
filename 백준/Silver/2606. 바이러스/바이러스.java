import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited = new boolean[101];

    static int[][] graph = new int[101][101];

    static int computer = 0;

    static int connection = 0;

    static int cnt = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        computer = Integer.parseInt(br.readLine()); // 컴퓨터의 수
        connection = Integer.parseInt(br.readLine()); //  네트워크가 연결된 컴퓨터 쌍의 수

        for (int i = 0; i < connection; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = graph[b][a] = 1;
        }

        bfs(1);

        System.out.println(cnt);
    }

    private static void bfs(int nodeIndex) {
        LinkedList<Integer> q = new LinkedList<>();

        q.add(nodeIndex);
        visited[nodeIndex] = true;

        while(!q.isEmpty()) {
            int node = q.poll();
            for (int i = 1; i <= computer; i++) {
                if(graph[node][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                    cnt++;
                }
            }
        }
    }
}