import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        
        if (a > b) {
            long temp = a;
            a = b;
            b = temp;
        }

        br.close();

        long answer = b * (b + 1) / 2 - (a - 1) * a / 2;

        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}
