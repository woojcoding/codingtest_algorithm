import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[]  args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int input = Integer.parseInt(br.readLine());

        for (int i = 2; i <= Math.sqrt(input); i++) {
            while (input % i == 0) {
                sb.append(i).append("\n");

                input /= i;
            }
        }

        if (input != 1) {
            sb.append(input);
        }

        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
