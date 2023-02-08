import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        br.close();

        int result = 0;

        for (int i = 1; i <= n; i++) {
            result += i;
        }

        sb.append(result);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}