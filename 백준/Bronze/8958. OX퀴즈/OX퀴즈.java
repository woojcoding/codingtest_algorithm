import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int score = 0;

        int result = 0;

        while (n-- > 0) {
            String testCase = br.readLine();

            result = 0;

            score = 0;

            for (int i = 0; i < testCase.length(); i++) {
                if (testCase.charAt(i) == 'O') {
                    score++;
                } else {
                    score = 0;
                }

                result += score;
            }

            sb.append(result).append("\n");
        }

        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
