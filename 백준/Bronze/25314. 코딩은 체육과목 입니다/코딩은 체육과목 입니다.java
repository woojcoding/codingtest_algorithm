import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine()) / 4;

        while (n-- > 0) {
            sb.append("long").append(" ");
        }

        sb.append("int");

        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
