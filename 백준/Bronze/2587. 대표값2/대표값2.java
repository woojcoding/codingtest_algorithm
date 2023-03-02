import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[]  args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int[] arr = new int[5];

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int a = Integer.parseInt(br.readLine());

            arr[i] = a;

            sum += a;
        }

        Arrays.sort(arr);

        br.close();

        sb.append(sum / 5).append("\n");
        sb.append(arr[arr.length / 2]);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
