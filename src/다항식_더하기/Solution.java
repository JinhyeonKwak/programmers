package 다항식_더하기;

public class Solution {

    public String solution(String polynomial) {
        String[] split = polynomial.split(" ");
        int first = 0;
        int constant = 0;
        for (String s : split) {
            if (s.contains("x")) {
                if (s.charAt(0) == 'x') {
                    first++;
                } else {
                    first += Integer.parseInt(s.substring(0, s.length() - 1));
                }
            } else if (s.matches("[1-9][0-9]*")) {
                constant += Integer.parseInt(s);
            }
        }
        String answer = "";
        if (first != 0) {
            if (first == 1) {
                answer += "x";
            } else {
                answer += first + "x";
            }
            if (constant != 0) {
                answer += " + " + constant;
            }
        } else {
            if (constant != 0) {
                answer += constant;
            }
        }
        return answer;
    }
}
