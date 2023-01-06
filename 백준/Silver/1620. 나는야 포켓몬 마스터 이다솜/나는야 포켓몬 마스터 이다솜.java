import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 도감 수록 포켓몬 개수
        int M = Integer.parseInt(st.nextToken()); // 문제의 개수

        for (int i = 1; i <= N; i++) {
            String pokemon = br.readLine();
            String num = Integer.toString(i);
            map.put(num, pokemon);
            map.put(pokemon, num);
        }
        for (int j = 0; j < M; j++) {
            String s = br.readLine();
            sb.append(map.get(s)).append("\n");
        }
        System.out.println(sb);
    }
}