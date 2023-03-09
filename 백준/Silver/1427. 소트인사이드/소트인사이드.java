import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        int num = Integer.parseInt(s);

        int[] arr = new int[s.length()];

        int[] cnt = new int[10];

        while (num != 0) {
            int digit = num % 10;

            cnt[digit]++;

            num /= 10;
        }

        for (int i = cnt.length - 1; i >= 0; i--) {
            while (cnt[i] > 0) {
                sb.append(i);
                cnt[i]--;
            }
        }

        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
