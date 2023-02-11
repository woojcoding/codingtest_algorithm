import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        boolean[] arr = new boolean[31];

        for (int i = 1; i < arr.length - 2; i++) {
            int idx = Integer.parseInt(br.readLine());
            arr[idx] = true;
        }

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] == false) {
                sb.append(j).append("\n");
            }
        }

        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
