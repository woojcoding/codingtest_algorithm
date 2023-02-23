import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int[][] arr = new int[100][100];

        int result = 0;

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int i = x; i <= x + 9; i++) {
                for (int j = 100 - y; j >= 91 - y; j--) {
                    arr[j][i] = 1;
                }
            }
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt == 1) {
                    result++;
                }
            }
        }

        br.close();

        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}
