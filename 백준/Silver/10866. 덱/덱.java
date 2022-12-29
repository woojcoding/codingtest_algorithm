
import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        LinkedList<Integer> list = new LinkedList<>();

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            String a = br.readLine();
            StringTokenizer st = new StringTokenizer(a);

            switch(st.nextToken()) {
                case "push_front":
                    list.addFirst(Integer.parseInt(st.nextToken()));
                    continue;
                case "push_back":
                    list.addLast(Integer.parseInt(st.nextToken()));
                    continue;
                case "pop_front":
                    sb.append(list.isEmpty() ? "-1" : list.removeFirst());
                    break;
                case "pop_back":
                    sb.append(list.isEmpty() ? "-1" : list.removeLast());
                    break;
                case "size":
                    sb.append(list.size());
                    break;
                case "empty":
                    sb.append(list.isEmpty() ? "1" : "0");
                    break;
                case "front":
                    sb.append(list.isEmpty() ? -1 : list.getFirst());
                    break;
                case "back":
                    sb.append(list.isEmpty() ? -1 : list.getLast());
                    break;
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}