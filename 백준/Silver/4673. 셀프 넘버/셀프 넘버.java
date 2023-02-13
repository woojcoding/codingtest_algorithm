import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] arr = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int idx = d(i);
            if (idx < 10001) {
                arr[idx] = true;
            }
        }

        for (int i = 1; i < 10001; i++) {
            if(!arr[i]) {
                sb.append(i).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static int d(int num) {
        int result = num;

        while (num != 0) {
            result += num % 10;

            num /= 10;
        }

        return result;
    }
}
