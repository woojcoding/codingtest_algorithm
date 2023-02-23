import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arrA = new int[n][m];
        int[][] arrB = new int[n][m];

        int[][] result = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < m; j++) {
                arrA[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < m; j++) {
                arrB[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                result[i][j] = arrA[i][j] + arrB[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                sb.append(result[i][j]).append(" ");
            }

            sb.append("\n");
        }

        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
