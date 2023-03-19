import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        int sum = Integer.MAX_VALUE;

        while (st.hasMoreTokens()) {
            int temp = 0;

            StringTokenizer plus = new StringTokenizer(st.nextToken(), "+");

            while (plus.hasMoreTokens()) {
                temp += Integer.parseInt(plus.nextToken());
            }

            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }

        br.close();

        bw.write(sum + "");
        bw.flush();
        bw.close();
    }
}
