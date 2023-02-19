import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;

        boolean stop;

        while (n-- > 0) {
            String s = br.readLine();

            stop = false;

            int length = s.length();
            for (int i = 0; i < length; i++) {
                if (stop == true) {
                    break;
                }
                for(int j = i + 2; j < length; j++) {
                    if(s.charAt(i) != s.charAt(j - 1) && s.charAt(i) == s.charAt(j)) {
                        stop = true;
                        break;
                    }
                }
            }
            if (stop == false) {
                cnt++;
            }
        }

        br.close();

        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}