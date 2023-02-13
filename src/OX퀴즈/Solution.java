package OX퀴즈;

public class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] q = quiz[i].split(" ");
            int a = Integer.parseInt(q[0]);
            int b = Integer.parseInt(q[2]);
            String op = q[1];
            int result = Integer.parseInt(q[4]);
            answer[i] = (calculate(a, b, op) == result) ? "O" : "X";
        }
        return answer;
    }

    static int calculate(int a, int b, String operator) {
        if (operator.equals("+")) return a + b;
        else return a - b;
    }

}