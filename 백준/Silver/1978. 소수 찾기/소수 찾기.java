import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = 0;

        while (n-- > 0) {
            int num = Integer.parseInt(st.nextToken());

            if (isPrime(num)){
                cnt++;
            }
        }

        br.close();

        bw.write(cnt + "");
        bw.flush();
        bw.close();

    }

    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        for (int i = 2; i < num - 1; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
