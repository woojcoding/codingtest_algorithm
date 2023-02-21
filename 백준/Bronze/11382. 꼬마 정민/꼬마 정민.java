import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long result = 0;

        while (st.hasMoreTokens()) {
            result += Long.parseLong(st.nextToken());
        }

        br.close();

        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}
