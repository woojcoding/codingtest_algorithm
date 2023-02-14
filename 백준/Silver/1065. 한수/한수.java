import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        sb.append(countArithmetic(n));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static int countArithmetic(int num) {
        int cnt = 99;

        if (num < 100) {
            return num;
        } else if (num == 1000) {
            return 144;
        } else { 
            for (int i = 100; i <= num; i++) {
                int units = i % 10;

                int tens = (i / 10) % 10;

                int hundreds = (i / 100) % 10;

                if ((hundreds - tens) == (tens - units)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}