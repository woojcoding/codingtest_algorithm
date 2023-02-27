import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        int result = 0;

        while (true) {
            if (n % 5 == 0) {
                result += n / 5;

                break;
            } else {
                n -= 3;

                result++;
            }

            if (n < 0) {
                result = -1;

                break;
            }
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}
