import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static int result = 1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int input = Integer.parseInt(br.readLine());

        function(input);

        br.close();

        bw.write(result + "");
        bw.flush();
        bw.close();
    }

    static void function(int num) {
        if (num == 0) {
            return;
        }

        result *= num;

        num--;
        
        function(num);
    }
}
