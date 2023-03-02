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

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());

        int a0 = Integer.parseInt(st.nextToken());

        int c = Integer.parseInt(br.readLine());

        int n0 = Integer.parseInt(br.readLine());

        int result = 1;

        for(int i = n0; i <= 100; i++) {
            if (a1 * i + a0 > c * i) {
                result = 0;
                break;
            }
        }

        br.close();

        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}
