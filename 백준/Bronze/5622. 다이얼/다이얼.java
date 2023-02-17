import java.io.*;

public class Main {
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        
        for (int i = 0; i < s.length(); i++) {
            time(s.charAt(i));
        }

        br.close();

        bw.write(count + "");
        bw.flush();
        bw.close();
    }

    public static void time(char s) {
        switch(s) {
            case 'A' : case 'B': case 'C' :
                count += 3;
                break;

            case 'D' : case 'E': case 'F' :
                count += 4;
                break;

            case 'G' : case 'H': case 'I' :
                count += 5;
                break;

            case 'J' : case 'K': case 'L' :
                count += 6;
                break;

            case 'M' : case 'N': case 'O' :
                count += 7;
                break;

            case 'P' : case 'Q': case 'R' : case 'S' :
                count += 8;
                break;

            case 'T' : case 'U': case 'V' :
                count += 9;
                break;

            case 'W' : case 'X': case 'Y' : case 'Z' :
                count += 10;
                break;
        }
    }
}
