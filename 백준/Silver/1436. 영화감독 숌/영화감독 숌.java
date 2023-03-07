import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[]  args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int input = Integer.parseInt(br.readLine());

        int num = 666;

        int cnt = 1;

        while (cnt < input) {
            num++;
            
            if (String.valueOf(num).contains("666")) {
                cnt++;
            }
        }

        br.close();

        bw.write(num + "");
        bw.flush();
        bw.close();
    }
}
