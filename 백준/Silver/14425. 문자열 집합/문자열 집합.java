import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<String> list = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 문자열의 개수
        int M = Integer.parseInt(st.nextToken()); // 검사해야 하는 문자열의 수

        for (int i =0; i < N; i++) {
            list.add(br.readLine());
        }
        int cnt = 0;
        for (int j = 0; j < M; j++) {
           if(list.contains(br.readLine())) cnt++;
        }
        System.out.println(cnt);
    }
}