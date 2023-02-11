import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        int max = Integer.MIN_VALUE;

        int sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            int score = Integer.parseInt(st.nextToken());

            arr[i] = score;

            sum += score;
        }

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }

        sb.append((double) sum / max * 100 / n);
        
        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}