import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

    static boolean[] visited;

    static int[] result;

    static int N;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 컴퓨터의 개수
        int M = Integer.parseInt(st.nextToken()); // 신뢰 관계

        visited = new boolean[N+1];

        result = new int[N+1];

        for (int i = 0; i <= N; i++) { //인접행렬을 사용하면 메모리 초과가 발생하여 인접리스트를 활용하여 문제 해결
            arr.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());

            arr.get(a).add(b); // 단방향
        }

        for (int i = 1; i <= N; i++) {
            bfs(i);
        }

        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= N; i++) {
            max = Math.max(max, result[i]);
        }

        for (int i = 1; i <= N; i++) {
            if(result[i] == max) {
                bw.write(i + " ");
            }
        }

        bw.flush();
        bw.close();
    }

    private static void bfs(int nodeIndex) {
        LinkedList<Integer> q = new LinkedList<>();
        visited = new boolean[N+1]; // 방문여부 초기화
        q.add(nodeIndex);
        visited[nodeIndex] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            for(int j : arr.get(node)) {
                if(!visited[j]) {
                    q.add(j);
                    visited[j] = true;
                    result[j]++;
                }
            }
        }
    }
}