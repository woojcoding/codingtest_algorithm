import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder(br.readLine());

        br.close();

        bw.write((sb.toString().equals(sb.reverse().toString()) ? 1 : 0) + "");
        bw.flush();
        bw.close();
    }
}
