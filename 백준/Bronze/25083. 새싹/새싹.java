import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        sb.append("         ,r'\"7").append("\n");
        sb.append("r`-_   ,'  ,/").append("\n");
        sb.append(" \\. \". L_r'").append("\n");
        sb.append("   `~\\/").append("\n");
        sb.append("      |").append("\n");
        sb.append("      |").append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}