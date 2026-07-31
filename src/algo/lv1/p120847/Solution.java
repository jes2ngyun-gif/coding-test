package algo.lv1.p120847;

import java.util.Arrays;

// 최댓값 만들기(1) : nums에서 가장 큰 수 2개를 찾고, 그 두 수를 곱해서 반환한다.
public class Solution {

    public int solution(int[] numbers) {
        int answer = 0;

        int max1 = 0;   // 가장 큰 수
        int max2 = 0;   // 두번째로 큰 수

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (num > max1) {        // 현재 숫자가 기존 1등보다 크면 기존1등은 2등으로, 현재 숫자가 1등으로 된다.
                max2 = max1;
                max1 = num;
            } else if (num > max2) { // 현재 숫자가 1등은 아니지만 2등보다 크면 현재 숫자가 새로운 2등이 된다.
                max2 = num;
            }
        }

        answer = max1 * max2;
        return answer;
    }

}

// 다른 풀이 : 배열 정렬 사용 -> 배열을 오름차순 정렬하면 가장 큰 두 수가 맨 뒤에 온다.
//
//public int solution(int[] numbers) {
//    Arrays.sort(numbers);         // 원본 배열의 순서를 바꿈
//
//    int lastIndex = numbers.length -1;
//
//    return numbers[lastIndex] * numbers[lastIndex -1];
//}
