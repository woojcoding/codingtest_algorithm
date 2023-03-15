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

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        while (n-- > 0) {
           map.put(Integer.parseInt(st.nextToken()), 0);
        }

        st = new StringTokenizer(br.readLine());

        while (m-- > 0) {
            int num = Integer.parseInt(st.nextToken());

            if (map.containsKey(num)) {
                map.remove(num);
            } else {
                map.put(num, 0);
            }
        }

        sb.append(map.size());

        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
