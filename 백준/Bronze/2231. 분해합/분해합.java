import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[]  args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int result = 0;

        for (int i = 0; i < n; i++) {
            int temp = i;

            int sum = temp;

            while (temp != 0) {
                sum += temp % 10;

                temp /= 10;
            }

            if (sum == n) {
                result = i;
                break;
            }
        }

        br.close();

        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}
