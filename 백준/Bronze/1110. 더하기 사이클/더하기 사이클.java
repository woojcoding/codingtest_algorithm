import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();

        if (s.length() < 2) {
            s = "0" + s;
        }

        String input = s;
        
        int cnt = 0;

        while (true) {
            int a = Character.getNumericValue(s.charAt(0));
            int b = Character.getNumericValue(s.charAt(1));
            int c = a + b;
            
            String sum = String.valueOf(c);

            if (sum.length() < 2) {
                sum = "0" +  sum;
            }

            s = String.valueOf(b) + sum.charAt(1);

            cnt++;

            if (s.equals(input)) {
                break;
            }
        }

        br.close();

        bw.write(cnt +"");
        bw.flush();
        bw.close();
    }
}