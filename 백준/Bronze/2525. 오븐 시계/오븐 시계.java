import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()); // 시
        int b = Integer.parseInt(st.nextToken()); // 분
        int c = Integer.parseInt(br.readLine()); // 필요 시간(분)

        br.close();

        b += c;

        if (b >= 60) {
            a += b / 60;
            b = b % 60;
        }

        if ( a >= 24) {
            a -= 24;
        }

        sb.append(a).append(" ").append(b);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}