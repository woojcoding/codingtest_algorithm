import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static boolean[] num;

    public static void main(String[]  args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        prime();

        int min;

        while (t-- > 0) {
            int a = Integer.parseInt(br.readLine());

            int num1 = 0;
            int num2 = 0;

            min = Integer.MAX_VALUE;

            for (int i = 2; i <= a / 2; i++) {
                if (!num[i] && !num[a - i]) {
                    if (Math.abs(a - 2 * i) < min) {
                        num1 = i;
                        num2 = a - i;
                        min = Math.abs(a - 2 * i);
                    }
                }
            }
            sb.append(num1).append(" ").append(num2).append("\n");
        }

        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static void prime() {
        num = new boolean[10001];

        num[0] = num[1] = true;

        for (int i = 2; i <= Math.sqrt(num.length); i++) {
            for (int j = i * i; j < num.length; j += i) {
                num[j] = true;
            }
        }
    }
}
