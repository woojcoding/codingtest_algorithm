import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        int T  = Integer.parseInt(br.readLine()); // 테스트 데이터의 수
        
        while(T-- > 0) {
            int k = Integer.parseInt(br.readLine()); //연산의 개수
            treeMap.clear();
            for(int i = 0; i < k; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                String s = st.nextToken();
                int val = Integer.parseInt(st.nextToken());
                if(s.equals("I")) {
                    treeMap.put(val,treeMap.getOrDefault(val,0)+1);
                } else if( s.equals("D")) {
                    if (treeMap.isEmpty()) {
                        continue;
                    }
                    if (val == 1) {
                        if(treeMap.get(treeMap.lastKey()) == 1){
                            treeMap.remove(treeMap.lastKey());
                        } else {
                            treeMap.put(treeMap.lastKey(), treeMap.get(treeMap.lastKey())-1);
                        }
                    } if (val == -1) {
                        if(treeMap.get(treeMap.firstKey()) == 1){
                            treeMap.remove(treeMap.firstKey());
                        } else {
                            treeMap.put(treeMap.firstKey(), treeMap.get(treeMap.firstKey())-1);
                        }
                    }
                }
            }
                if(treeMap.isEmpty()) {
                    sb.append("EMPTY").append("\n");
                 }
                else {
                    sb.append(treeMap.lastKey()).append(" ").append(treeMap.firstKey()).append("\n");
                }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}