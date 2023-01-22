import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited = new boolean[1001];
    static int[][] graph = new int[1001][1001];
    static int N = 0;
    static int M = 0;
    static int V = 0;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st1.nextToken()); // 정점의 개수
        M = Integer.parseInt(st1.nextToken()); // 간선의 개수
        V = Integer.parseInt(st1.nextToken()); // 탐색을 시작할 정점의 번호

        for(int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            graph[a][b] = graph[b][a] = 1;
        }
        dfs(V);
        sb.append("\n");
        Arrays.fill(visited,false); // 방문 여부 초기화
        bfs(V);
        System.out.println(sb);
    }

    public static void dfs(int nodeIndex) {
        sb.append(nodeIndex).append(" "); // 해당 노드 출력
        visited[nodeIndex] = true; // 방문처리
        for (int i = 1; i <=N; i++) {
            if(graph[nodeIndex][i] == 1 && !visited[i]) { // 만약 간선이 있는데 노드를 방문하지 않았다면 재귀 호출
                dfs(i);
            }
        }
    }
    public static void bfs(int nodeIndex) {
        LinkedList<Integer> q = new LinkedList<>();

        q.add(nodeIndex);    // Queue 에 넣고
       visited[nodeIndex] = true;   // 방문 체크를 해준다.

       while(!q.isEmpty()) {
           int node = q.poll(); // 큐에서 노드를 빼주고
           sb.append(node).append(" ");
           for (int i =1; i <=N; i++) {
              if (graph[node][i] == 1 && !visited[i]) { // 해당 노드에 간선이 있는데 방문체크가 되지 않은 노드에 대해서
                  q.add(i); // 큐에 넣어주고
                  visited[i] = true;    //방문 체크를 해준다.
              }
           }
       }
    }
}