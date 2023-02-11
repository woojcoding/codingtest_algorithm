import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int[] arr = new int[42];

        int cnt = 0;

        String input = "";

        while ((input = br.readLine()) != null) {
            int idx = Integer.parseInt(input) % 42;
            arr[idx] ++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                cnt++;
            }
        }

        br.close();

        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}
