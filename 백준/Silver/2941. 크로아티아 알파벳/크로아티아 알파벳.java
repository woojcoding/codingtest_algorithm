import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int cnt = 0;

        int length = s.length();

        for (int i = 0; i < length; i++) {

            if (s.charAt(i) == 'c' && i < length - 1) {
                if (s.charAt(i + 1) == '-' || s.charAt(i + 1) == '=') {
                    i++;
                }
            }

            else if (s.charAt(i) == 'd' && i < length - 1) {
                if (s.charAt(i + 1) == 'z' && i < length - 2) {
                    if (s.charAt(i + 2) == '=') {
                        i += 2;
                    }
                }

                else if (s.charAt(i + 1) == '-') {
                    i++;
                }
            }

            else if ((s.charAt(i) == 'l' || s.charAt(i) == 'n') && i < length - 1) {
              if (s.charAt(i + 1) == 'j') {
                  i++;
              }
            }

            else if ((s.charAt(i) == 's' || s.charAt(i) == 'z') && i < length - 1) {
                if (s.charAt(i + 1) == '=') {
                    i++;
                }
            }

            cnt++;
        }

        br.close();

        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}
