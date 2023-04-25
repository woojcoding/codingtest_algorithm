class Solution {
    public String solution(int age) {
        String[] arr = Integer.toString(age).split("");
        
        String answer = "";
        
        for (int i = 0; i < arr.length; i++) {
            answer += (char)(Integer.parseInt(arr[i]) + 97);
        }
        
        return answer;
    }
}