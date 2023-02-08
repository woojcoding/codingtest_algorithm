import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int totalPrice = Integer.parseInt(br.readLine());
        int itemType = Integer.parseInt(br.readLine());

        int calculatedPrice = 0;

        for (int i = 0; i < itemType; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int item = Integer.parseInt(st.nextToken());
            int quantity = Integer.parseInt(st.nextToken());

            calculatedPrice += item * quantity;
        }

        if (totalPrice == calculatedPrice) {
            sb.append("Yes");
        } else {
            sb.append("No");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}