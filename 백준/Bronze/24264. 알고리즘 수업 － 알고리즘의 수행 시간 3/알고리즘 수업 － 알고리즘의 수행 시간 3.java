import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[]  args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        Long n = Long.parseLong(br.readLine());

        sb.append(n * n).append("\n");
        sb.append("2");

        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
