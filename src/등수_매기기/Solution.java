package 등수_매기기;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] answer = s.solution(new int[][]{{1, 3}, {3, 1}, {2, 3}, {3, 2}, {1, 2}, {0, 0}});
        Arrays.stream(answer)
                .forEach(System.out::println);
    }

    public int[] solution(int[][] scores) {
        List<Integer> meanScores = Arrays.stream(scores)
                .mapToInt(s -> s[0] + s[1])
                .boxed()
                .collect(Collectors.toList());
        int maxVal = Collections.max(meanScores);
        int[] count = new int[maxVal + 1];
        meanScores.stream()
                .forEach(s -> count[s]++);
        int[] answer = new int[meanScores.size()];
        for (int i = 0; i < answer.length; i++) {
            int score = meanScores.get(i);
            for (int j = score + 1; j < count.length; j++) {
                answer[i] += count[j];
            }
            answer[i]++;
        }
        return answer;
    }

}

