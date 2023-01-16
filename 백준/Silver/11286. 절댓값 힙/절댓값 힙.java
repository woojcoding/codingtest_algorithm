import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 연산의 개수

        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1) > Math.abs(o2)) {
                    return Math.abs(o1) - Math.abs(o2);
                } else if (Math.abs(o1) == Math.abs(o2)) {
                    return o1 - o2;
                } else {
                    return -1;
                }
            }
        });

        for(int i =0; i < N; i++) {
            int t = Integer.parseInt(br.readLine());
            if(t == 0) {
                if(pq.isEmpty()) {sb.append("0").append("\n");}
                else {sb.append(pq.poll()).append("\n");}
            } else {
                pq.add(t);
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}