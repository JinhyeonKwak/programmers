package 겹치는_선분의_길이;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    static int[] count;
    static boolean[] visited;

    public int solution(int[][] lines) {
        count = new int[201]; // -100 ~ 100
        visited = new boolean[201];
        for (int[] line : lines) {
            checkLine(line);
        }

        int answer = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] >= 2 && !visited[i]) {
                answer += BFS(i);
            }
        }
        return answer;
    }

    static int BFS(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        int result = 0;
        while (!q.isEmpty()) {
            int now = q.poll();
            if (now + 1 <= 200 && count[now + 1] >= 2) {
                result++;
                visited[now + 1] = true;
                q.add(now + 1);
            }
        }
        return result;
    }

    static void checkLine(int[] line) {
        int start = line[0];
        int end = line[1];
        for (int i = start + 1; i <= end; i++) {
            count[i + 100]++;
        }
    }
}
