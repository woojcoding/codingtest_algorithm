import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        if (A > B) {
            sb.append(A);
        } else {
            sb.append(B);
        }

        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
