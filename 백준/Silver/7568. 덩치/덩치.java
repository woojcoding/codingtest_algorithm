import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]  args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[][] spec = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            spec[i][0] = Integer.parseInt(st.nextToken());
            spec[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            int rank = 1;

            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }

                if (spec[i][0] < spec[j][0] && spec[i][1] < spec[j][1] ) {
                    rank++;
                }
            }

            sb.append(rank).append(" ");
        }

        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
