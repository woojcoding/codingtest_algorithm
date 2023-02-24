import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        int n = 1;
        
        int temp = 1;
        
        while (temp < input) {
            n++;
            
            temp += 6 * n - 6;
        }

        br.close();

        bw.write(n + "");
        bw.flush();
        bw.close();
    }
}
