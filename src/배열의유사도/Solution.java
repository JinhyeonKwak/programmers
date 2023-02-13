package 배열의유사도;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        Set<String> source = Arrays.stream(s1)
                .collect(Collectors.toCollection(HashSet::new));
        for (String s : s2) {
            if (source.contains(s)) {
                answer++;
            }
        }
        return answer;
    }
}