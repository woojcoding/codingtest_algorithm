import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int[] arr = new int[10];

        int max = Integer.MIN_VALUE;
        int maxIdx = 0;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                maxIdx = i;
            }
        }

        br.close();

        sb.append(max).append("\n").append(maxIdx);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
