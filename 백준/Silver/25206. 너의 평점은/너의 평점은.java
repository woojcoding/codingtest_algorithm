import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;

        double average = 0;

        double credits = 0;

        double grade = 0;

        while ((input = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(input);

            st.nextToken();

            double credit = Double.parseDouble(st.nextToken());

            switch (st.nextToken()) {
                case "A+":
                    grade = 4.5;
                    break;
                case "A0":
                    grade = 4.0;
                    break;
                case "B+":
                    grade = 3.5;
                    break;
                case "B0":
                    grade = 3.0;
                    break;
                case "C+":
                    grade = 2.5;
                    break;
                case "C0":
                    grade = 2.0;
                    break;
                case "D+":
                    grade = 1.5;
                    break;
                case "D0":
                    grade = 1.0;
                    break;
                case "F":
                    grade = 0;
                    break;
                case "P":
                    grade = -1;
                    break;
            }
            if (grade != -1) {
                average = (average * credits + credit * grade) / (credits + credit);

                credits += credit;
            }
        }

        br.close();

        bw.write(average + "");
        bw.flush();
        bw.close();
    }
}