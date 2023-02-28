import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        while (true) {
            int num = Integer.parseInt(br.readLine());

            ArrayList<Integer> list = new ArrayList<>();

            int sum = 0;

            if (num == -1) {
                break;
            }

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    list.add(i);

                    sum += i;
                }
            }

            if (sum == num) {
                sb.append(num).append(" = ");

                for (int j = 0; j < list.size() - 1; j++) {
                    sb.append(list.get(j)).append(" + ");
                }

                sb.append(list.get(list.size() - 1)).append("\n");
            }

            else {
                sb.append(num).append(" is NOT perfect.").append("\n");
            }
        }

            br.close();

            bw.write(sb.toString());
            bw.flush();
            bw.close();
    }
}
