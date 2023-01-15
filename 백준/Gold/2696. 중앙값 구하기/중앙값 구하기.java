import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수

        ArrayList<Integer> list = new ArrayList<>();
        while( T-- > 0) { // 테스트 케이스 수 만큼 반복
            int M = Integer.parseInt(br.readLine()); // 수열의 크기
            int cnt = M / 10 + 1;

            String s = "";
            for(int j = 0; j < cnt; j++) { // 한줄에 10개 원소만 오기에 수열의 크기 / 10 + 1 만큼 읽어준다.
               s += br.readLine() + " ";
            }

            StringTokenizer st = new StringTokenizer(s);
            sb.append(M / 2 + 1).append("\n");
            int sbSize = 0;
            for(int i = 1; i <= M; i++) {
                list.add(Integer.parseInt(st.nextToken()));
                if(list.size() % 2 == 1) { // 홀수일 경우마다 sb에 추가해준다.
                    sbSize ++;
                    int middle = i / 2;
                    Collections.sort(list);
                    sb.append(list.get(list.size() / 2)).append(" ");
                }
                if(sbSize >= 10) { // 한줄에 원소 10개씩만 출력하기에 10개가 됏다면 줄바꿈을 해주고 sbSize를 0으로 초기화
                    sb.append("\n");
                    sbSize = 0;
                }
            }
            sb.append("\n");
            list.clear();
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}