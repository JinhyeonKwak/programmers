package 겹치는_선분의_길이;

public class Solution {
    static int[] count;

    public int solution(int[][] lines) {
        count = new int[201]; // -100 ~ 100
        for (int[] line : lines) {
            checkLine(line);
        }

        int answer = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] >= 2) {
                answer++;
            }
        }
        return answer;
    }

    static void checkLine(int[] line) {
        int start = line[0];
        int end = line[1];
        for (int i = start + 1; i <= end; i++) {
            count[i + 100]++;
        }
    }
}
