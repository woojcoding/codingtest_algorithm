import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int cnt = 0;

        for (int i = 1; i <= a; i++) {
            if(a % i == 0) {
                cnt++;

                if (cnt == b) {
                    sb.append(i);
                   break;
                }
            }
        }

        if (cnt < b) {
            sb.append(0);
        }

        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
