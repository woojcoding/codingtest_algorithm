import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[]  args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        long n = Long.parseLong(br.readLine());

        // C(n, 3) = n! / (3! * (n-3)!) = n*(n-1)*(n-2)/6
        sb.append(n * (n - 1) * (n - 2) / 6).append("\n");
        sb.append("3");

        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
