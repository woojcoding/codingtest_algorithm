import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        br.close();

        bw.write(function(input) + "");
        bw.flush();
        bw.close();
    }
    
    private static int function(int num) {
        if (num < 2) {
            return num;
        }

        return function(num - 1) + function(num - 2);
    }
}
