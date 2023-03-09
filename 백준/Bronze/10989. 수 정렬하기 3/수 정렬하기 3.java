import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int input = Integer.parseInt(br.readLine());
        
        int[] cnt = new int[10001];

        for (int i = 0; i < input; i++) {
            int idx = Integer.parseInt(br.readLine());

            cnt[idx]++;
        }

        for(int i = 1; i < cnt.length; i++){
            while(cnt[i] > 0){
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        
        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
