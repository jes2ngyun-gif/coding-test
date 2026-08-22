package algo.lv1.p12933;

import java.util.Arrays;

// 정수 내림차순으로 배치하기
public class Solution {

    public long solution(long n) {

        char[] numbers = String.valueOf(n).toCharArray();

        Arrays.sort(numbers);

        StringBuilder sb = new StringBuilder();

        for (int i = numbers.length - 1; i >= 0; i--) {
            sb.append(numbers[i]);
        }

        return Long.parseLong(sb.toString());
    }

}
