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

        int[] arr = new int[8];

        boolean isAscending = true;

        boolean isDescending = true;

        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] > arr[j-1]) {
                isDescending = false;
            } else if (arr[j] < arr[j-1]) {
                isAscending = false;
            }
        }

        if (isAscending) {
            bw.write("ascending");
        } else if (isDescending) {
            bw.write("descending");
        } else {
            bw.write("mixed");
        }

        bw.flush();
        bw.close();
    }
}
