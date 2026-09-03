package algo.lv1.p86051;
// 없는 숫자 더하기
// 전체 숫자의 합(45) - 배열에 존재하는 숫자의 합 = 배열에 존재하지 않는 숫자들의 합
public class Solution {

    public int solution(int[] numbers) {
        int answer = -1;

        answer = 45;                                   // 이미 만들어진 answer의 값만 -1에서 45로 변경한다.

        for (int i =0; i < numbers.length; i++) {      // numbers 배열을 처음부터 끝까지 확인

            answer = answer - numbers[i];               // 배열에 존재하는 숫자를 전체 합에서 뺀다.
        }
        return answer;                                  // 없는 숫자의 합만 남는다.
    }
}

// 다른 풀이 : 향상된 for문

public int solution(int[] numbers) {

    // 0부터 9까지의 전체 합
    int answer = 45;

    // numbers에서 숫자를 하나씩 꺼내 number에 저장한다.
    for (int number : numbers) {

        // 배열에 존재하는 숫자를 전체 합에서 뺀다.
        answer = answer - number;
    }

    // 없는 숫자들의 합 반환
    return answer;
}
