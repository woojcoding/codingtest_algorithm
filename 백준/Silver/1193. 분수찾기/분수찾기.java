import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        int line = 1;

        int standard = 1;

        while (input > standard) {
            line++;

            standard += line;
        }

        int idx = line - (standard - input);

        String result = "";

        if (line % 2 == 0) {
            result = idx + "/" + (line - idx + 1);
        } else {
            result = (line - idx + 1) + "/" + idx;
        }

        br.close();

        bw.write(result);
        bw.flush();
        bw.close();
    }
}
