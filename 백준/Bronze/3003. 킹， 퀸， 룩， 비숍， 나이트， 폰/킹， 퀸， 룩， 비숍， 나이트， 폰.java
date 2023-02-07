import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int king = Integer.parseInt(st.nextToken());
        int queen = Integer.parseInt(st.nextToken());
        int look = Integer.parseInt(st.nextToken());
        int bishop = Integer.parseInt(st.nextToken());
        int knight = Integer.parseInt(st.nextToken());
        int pawn = Integer.parseInt(st.nextToken());

        br.close();

        sb.append(1 - king).append(" ");
        sb.append(1 - queen).append(" ");
        sb.append(2 - look).append(" ");
        sb.append(2 - bishop).append(" ");
        sb.append(2 - knight).append(" ");
        sb.append(8 - pawn).append(" ");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}