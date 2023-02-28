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

        int min = Integer.parseInt(br.readLine());
        int max = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        int sum = 0;

        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }

        for (int prime : list) {
            sum += prime;
        }

        if (!list.isEmpty()) {
            sb.append(sum).append("\n");
            sb.append(list.get(0));
        }

        else {
            sb.append("-1");
        }

        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
