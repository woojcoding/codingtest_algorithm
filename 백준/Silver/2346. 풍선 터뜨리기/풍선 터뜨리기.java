import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

class Ballon {
    int idx;
    int value;

    public Ballon(int idx, int value) {
        this.idx = idx;
        this.value = value;
    }

}

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Ballon> dq = new ArrayDeque<>();

        int T = Integer.parseInt(br.readLine()); // 제공 되는 숫자의 수

        StringTokenizer st = new StringTokenizer(br.readLine());


        for(int i = 1; i <= T; i++) {
            int value = Integer.parseInt(st.nextToken());
          dq.addLast(new Ballon(i,value));
        }



        while (!dq.isEmpty()) {

            sb.append(dq.getFirst().idx).append(" ");
            int val = dq.poll().value;
            if(dq.isEmpty()){
                break;
            }

            if (val > 0) {
                val--;
                for(int i = 0; i < val; i++) {
                    dq.addLast(dq.pollFirst());
                }
            }
             else {
                for(int i = 0; i < Math.abs(val); i++) {
                    dq.addFirst(dq.pollLast());
                }
            }

        }
        System.out.println(sb);
    }
}