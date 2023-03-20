import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        int idx = Integer.parseInt(br.readLine());

        sb.append(s.charAt(idx - 1));

        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
