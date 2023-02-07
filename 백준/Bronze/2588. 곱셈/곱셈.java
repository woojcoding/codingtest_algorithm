import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();

        br.close();

        for (int i = b.length()-1; i >= 0; i--) {
            sb.append(a * Character.getNumericValue(b.charAt(i))).append("\n");
        }

        sb.append(a * Integer.parseInt(b));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}