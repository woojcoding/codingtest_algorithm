import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        int[][] apart = new int[15][15];

        for (int i = 0; i < apart[0].length; i++) {
            apart[i][1] = 1;
            apart[0][i] = i;
        }

        for (int i = 1; i < apart.length; i++) {
            for (int j = 2; j < apart[0].length; j++) {
                apart[i][j] = apart[i - 1][j] + apart[i][j -1];
            }
        }

        while (t-- > 0) {
            int floor = Integer.parseInt(br.readLine());
            int num = Integer.parseInt(br.readLine());

            sb.append(apart[floor][num]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
