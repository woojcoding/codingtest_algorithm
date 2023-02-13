import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int c = Integer.parseInt(br.readLine());

        while (c-- > 0) {
            int sum = 0;

            int avg = 0;

            int cnt = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                int score = Integer.parseInt(st.nextToken());

                sum += score;

                arr[i] = score;
            }
            avg = sum / n;

            for (int score : arr) {
                if (score > avg) {
                    cnt++;
                }
            }

            String result = String.format("%.3f",(double) cnt / n * 100);

            sb.append(result).append("%").append("\n");
        }

        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
