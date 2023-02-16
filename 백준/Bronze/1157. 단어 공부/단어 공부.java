import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine().toUpperCase();

        int[] cnt = new int[26];

        char result = '?';

        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'A';

            cnt[idx]++;
        }

        for (int i = 0; i < cnt.length; i++) {
            if(cnt[i] > max) {
                max = cnt[i];

                result = (char) (i + 'A');
            } else if (cnt[i] == max) {
                result = '?';
            }
        }
        
        br.close();

        bw.write(result);
        bw.flush();
        bw.close();
    }
}