import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int score = Integer.parseInt(br.readLine());
        
        br.close();
        
        switch (score / 10) {
            case 10:
            case 9:
                sb.append("A");
                break;
            case 8:
                sb.append("B");
                break;
            case 7:
                sb.append("C");
                break;
            case 6:
                sb.append("D");
                break;
            default:
                sb.append("F");
                break;
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}