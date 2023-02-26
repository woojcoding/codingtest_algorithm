import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        String input;

        int result = 1;

        int[] arr = new int[10];

        while ((input = br.readLine()) != null) {
            result *= Integer.parseInt(input);
        }

        while (result > 0) {
            int digit = result % 10;
            arr[digit]++;
            result /= 10;
        }

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
