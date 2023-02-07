import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        br.close();

        sb.append((A + B) % C).append("\n");
        sb.append(((A % C) + (B % C)) % C).append("\n");
        sb.append((A * B) % C).append("\n");
        sb.append(((A % C) * (B % C)) % C).append("\n");


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
