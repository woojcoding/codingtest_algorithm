import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[]  args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        long sum = 0;

        while (n-- > 0){
            sum += n;
        }

        sb.append(sum).append("\n");
        sb.append("2");

        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
