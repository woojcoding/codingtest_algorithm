import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int goal = Integer.parseInt(st.nextToken());

        //a * day - b * (day -1) = goal
        double day =Math.ceil((double) (goal - b) / (a -b));

        br.close();

        bw.write((int)day + "");
        bw.flush();
        bw.close();
    }
}
