import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());

        br.close();

        while(n-- > 0) {
            arr[n] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < arr.length; i++) {
            if( arr[i] > max) {
                max = arr[i];
            }
            if ( arr[i] < min) {
                min = arr[i];
            }
        }
        
        sb.append(min).append(" ").append(max);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
