import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        br.close();

        m -= 45;

        if (m < 0) {
            m += 60;
            h -= 1;
        }

        if (h < 0) {
            h += 24;
        }

        sb.append(h).append(" ").append(m);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}