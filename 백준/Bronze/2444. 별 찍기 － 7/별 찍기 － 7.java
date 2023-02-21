import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int anInt = Integer.parseInt(br.readLine());

        int t = 2 * anInt - 1;

        int blankRepeat= anInt - 1;

        int cnt = 0;

        int statRepeat = 1;

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < blankRepeat; j++) {
                sb.append(" ");
            }
            for (int j = 0; j < statRepeat; j++) {
                sb.append("*");
            }

            cnt++;

            if (cnt < anInt) {
                statRepeat += 2;
                blankRepeat--;
            } else {
                statRepeat -= 2;
                blankRepeat++;
            }

            sb.append("\n");
        }

        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
