import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 9; i++) {
            sb.append(a + " * " + i + " = " + a * i).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}