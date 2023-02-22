import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = 0;

        String input = br.readLine();

        String reverse = new StringBuffer(input).reverse().toString();

        if (input.equals(reverse)) {
            result = 1;
        }

        br.close();

        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}
