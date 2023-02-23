import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int[][] arr = new int[9][9];

        int max = Integer.MIN_VALUE;
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for  (int j = 0; j< arr[0].length; j++) {
                int value = Integer.parseInt(st.nextToken());
                arr[i][j] = value;

                if (value > max) {
                    max = value;

                    result = (i + 1) + " " + (j + 1);
                }
            }
        }

        sb.append(max + "").append("\n");
        sb.append(result);

        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
