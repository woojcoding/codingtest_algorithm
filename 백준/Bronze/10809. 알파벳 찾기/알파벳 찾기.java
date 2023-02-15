import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int[] arr = new int[26];

        Arrays.fill(arr, -1);

        String word = br.readLine();

        for (int i = 0; i < word.length(); i++) {
            char alphabet = word.charAt(i);

            int idx = (int) alphabet - 97;

            if(arr[idx] == -1) {
                arr[idx] = i;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            sb.append(arr[j]).append(" ");
        }

        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}