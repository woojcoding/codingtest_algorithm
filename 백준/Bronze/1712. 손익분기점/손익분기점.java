import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()); // 고정지출
        int b = Integer.parseInt(st.nextToken()); // 생산비용
        int c = Integer.parseInt(st.nextToken()); // 수입

        int cnt = -1;

        if (c - b > 0) {
            cnt = a / (c - b) + 1;
        }
        
        br.close();

        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}
