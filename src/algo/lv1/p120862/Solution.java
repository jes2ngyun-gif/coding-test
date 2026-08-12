package algo.lv1.p120862;

import java.util.Arrays;

// 최댓값 구하기(2)
public class Solution {

    public int solution(int[] numbers) {

        int answer = 0;

        Arrays.sort(numbers);                 // 배열을 오름차순으로 정렬한다.

        int lastIndex = numbers.length - 1;   // 배열의 마지막 인덱스를 저장한다.

        int candidate1 = numbers[0] * numbers[1];
             // 음수끼리 곱하면 큰 양수가 될 수 있음.

        int candidate2 = numbers[lastIndex] * numbers[lastIndex - 1];
             // 가장 큰 수 2개의 곱

        answer = Math.max(candidate1, candidate2);
             // 두 후소 중 더 큰 값을 answer에 저장

        return answer;
    }
}

// 다른 풀이 : Stream 사용 : 스트림으로 정렬 후 계산할 수 있다.

//public class Solution {
//public int solution(int[] numbers) {
//
//        int[] sorted = Arrays.stream(numbers)
//                             .sorted()
//                              .toArray();
//
//        int lastIndex = sorted.length - 1;
//
//        int candidate1 = sorted[0] * sorted[1];
//
//        int candidate2 = sorted[lastIndex] * sorted[lastIndex - 1];
//
//        return Math.max(candidate1, candidate2);
//}
//}
