import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 총 바구니 개수
        int m = Integer.parseInt(st.nextToken()); // 공 번호

        int[] basket = new int[n + 1];

        while (m-- > 0) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st2.nextToken());
            int end = Integer.parseInt(st2.nextToken());
            int ball = Integer.parseInt(st2.nextToken());

            for (int i = start; i <= end; i++) {
                basket[i] = ball;
            }
        }

        for (int i = 1; i < basket.length; i++) {
            sb.append(basket[i]).append(" ");
        }
        
        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
