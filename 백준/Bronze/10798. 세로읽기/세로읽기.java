import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        char[][] arr = new char[5][15];

        for (int i = 0; i < 5; i++) {
            Arrays.fill(arr[i], '!');
        }
        
        for (int i = 0; i < 5; i++) {
            String s = br.readLine();

            for (int j = 0; j < 15; j++) {
                if (j == s.length()) {
                    break;
                }
                arr[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] != '!'){
                    sb.append(arr[j][i]);
                }
            }
        }

        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
