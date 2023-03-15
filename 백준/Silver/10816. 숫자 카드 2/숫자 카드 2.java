import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        HashMap<Integer, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        while (n-- > 0) {
            int num = Integer.parseInt(st.nextToken());

            map.put(num, map.getOrDefault(num,0) + 1);
        }

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        while (m-- > 0) {
            int result = map.getOrDefault(Integer.parseInt(st.nextToken()), 0);

            sb.append(result).append(" ");
        }

        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
