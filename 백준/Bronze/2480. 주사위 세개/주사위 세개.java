import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        br.close();

        if ( a == b && b == c) {
            sb.append(10000 + a * 1000);
        } else if (a == b || a == c ) {
            sb.append(1000 + a * 100);
        } else if (b == c) {
            sb.append(1000 + b * 100);
        } else {
            sb.append(Math.max(Math.max(a,b),c) * 100);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}