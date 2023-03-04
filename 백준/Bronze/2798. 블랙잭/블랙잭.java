import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]  args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int sum = Integer.parseInt(st.nextToken());

        int result = 0;

        st = new StringTokenizer(br.readLine());

        int[] cards = new int[count];

        for (int i = 0; i < count; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                for (int k = j + 1; k < count; k++) {
                    int temp = cards[i] + cards[j] + cards[k];

                    if (temp <= sum && temp > result) {
                        result = temp;
                    }
                }
            }
        }

        br.close();

        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}
