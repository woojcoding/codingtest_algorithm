
import java.io.*;
import java.util.HashMap;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Double> stack = new Stack<>();
        int s = Integer.parseInt(br.readLine());
        HashMap<Character, Double> hashMap = new HashMap<>();
        String expression = br.readLine();


        for (int i = 0; i < s; i++) {
            for (int j = 0; j < expression.length(); j++) {

                if (Character.isUpperCase(expression.charAt(j))) {
                    if(hashMap.containsKey(expression.charAt(j))) {
                        stack.add(hashMap.get(expression.charAt(j)));
                    }
                    else{
                        double t = Double.parseDouble(br.readLine());
                        hashMap.put(expression.charAt(j),t);
                        stack.add(t);
                    }
                } else if (expression.charAt(j) == '*') {
                    double a = stack.pop();
                    double b = stack.pop();
                    stack.add(b * a);
                } else if (expression.charAt(j) == '+') {
                    double a = stack.pop();
                    double b = stack.pop();
                    stack.add(b + a);
                } else if (expression.charAt(j) == '/') {
                    double a = stack.pop();
                    double b = stack.pop();
                    stack.add(b / a);

                } else if (expression.charAt(j) == '-') {
                    double a = stack.pop();
                    double b = stack.pop();
                    stack.add(b - a);
                }
            }
        }
        System.out.println(String.format("%.2f", stack.pop()));
    }
}
