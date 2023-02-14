import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char input = br.readLine().charAt(0);

        int result = (int) input;

        br.close();

        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
    }
}