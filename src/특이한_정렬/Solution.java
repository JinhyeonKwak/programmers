package 특이한_정렬;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] numlist, int n) {

        return Arrays.stream(numlist)
                .boxed()
                .sorted((a, b) -> {
                    if (Math.abs(n - a) == Math.abs(n - b)) {
                        return b - a;
                    } else {
                        return Math.abs(n - a) - Math.abs(n - b);
                    }
                })
                .mapToInt(i -> i)
                .toArray();

    }
}
