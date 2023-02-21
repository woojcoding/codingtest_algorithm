import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            String s = br.readLine();
            sb.append(s.charAt(0)).append(s.charAt(s.length() - 1)).append("\n");
        }

        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
