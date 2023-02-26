import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int h = Integer.parseInt(st.nextToken()); // 층 수
            int w = Integer.parseInt(st.nextToken()); // 방 수
            int n = Integer.parseInt(st.nextToken()); // 몇 번째 손님

            int floor = n % h;

            double num = Math.ceil((double) n / h);

            if (num < 10) {
                sb.append(floor == 0 ? h : floor).append("0").append((int)num).append("\n");
            } else {
                sb.append(floor == 0 ? h : floor).append("").append((int)num).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
