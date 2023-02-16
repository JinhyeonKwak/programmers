package 연속된_수의_합;

public class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int firstTerm = (2 * total - num * (num - 1)) / (2 * num);
        for (int i = 0; i < num; i++) {
            answer[i] = firstTerm + i;
        }
        return answer;
    }
}
