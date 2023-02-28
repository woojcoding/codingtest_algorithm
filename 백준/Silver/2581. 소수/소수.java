import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static boolean[] prime;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        prime = new boolean[n + 1];

        prime();

        int sum = 0;

        int min = Integer.MAX_VALUE;

        for (int i = m; i <= n; i++) {
            if (prime[i] == false) {
                sum += i;

                if (min == Integer.MAX_VALUE) {
                    min = i;
                }
            }
        }

        if (sum != 0) {
            sb.append(sum).append("\n");
            sb.append(min);
        }

        else {
            sb.append("-1");
        }

        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
    
    public static void prime() {
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            for (int j = i * i; j < prime.length; j = j + i) {
                prime[j] = true;
            }
        }
    }
}
