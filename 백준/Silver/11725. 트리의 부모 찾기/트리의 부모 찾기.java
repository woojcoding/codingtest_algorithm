import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

    static int N = 0;

    static int[] parent;

    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine()); // 노드 개수

        parent = new int[N+1];
        visited = new boolean[N+1];

        for (int i = 0; i <= N; i++) { //인접행렬을 사용하면 메모리 초과가 발생하여 인접리스트를 활용하여 문제 해결
            arr.add(new ArrayList<>());
        }

        for(int i = 1; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr.get(a).add(b);
            arr.get(b).add(a);
        }
        bfs(1);


        for(int i=2; i <= N; i++){ // 2번 노드부터 순서대로 출력
            sb.append(parent[i]).append("\n");
        }

        System.out.println(sb);
    }

    private static void bfs(int nodeIndex) { //bfs를 하며 부모노드를 기록해둔다.
        LinkedList<Integer> q = new LinkedList<>();

        q.add(nodeIndex);
        visited[nodeIndex] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            for(int j : arr.get(node)){
                if (!visited[j]) {
                    q.add(j);
                    visited[j] = true;
                    parent[j] = node;
                }
            }
        }
    }
}