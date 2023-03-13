import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Member[] members = new Member[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            members[i] = new Member(Integer.parseInt(st.nextToken()), i, st.nextToken());
        }

        Arrays.sort(members);

        for (Member member : members) {
            sb.append(member.age).append(" ").append(member.name).append("\n");
        }
        
        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static class Member implements Comparable<Member> {
        int age;

        int order;

        String name;

        public Member(int age, int order, String name) {
            this.age = age;
            this.order = order;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public int getOrder() {
            return order;
        }

        public String getName() {
            return name;
        }

        @Override
        public int compareTo(Member o) {
            if (this.age == o.getAge()) {
                return Integer.compare(this.order, o.getOrder());
            }
            return Integer.compare(this.age, o.getAge());
        }
    }
}
