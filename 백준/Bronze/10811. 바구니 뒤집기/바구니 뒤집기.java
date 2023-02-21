import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 총 바구니 개수
        int m = Integer.parseInt(st.nextToken()); // 반복 횟수

        int[] basket = new int[n + 1];

        for (int i = 0; i < basket.length; i++) {
            basket[i] = i;
        }

        while (m-- > 0) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int left = Integer.parseInt(st2.nextToken());
            int right = Integer.parseInt(st2.nextToken());

            while (left < right) {
                int temp = basket[left];

                basket[left] = basket[right];
                basket[right] = temp;

                left++;

                right--;
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
