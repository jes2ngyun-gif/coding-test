package algo.lv1.p120833;
// 배열 자르기
public class Solution {

    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];   // num1번째 인덱스부터 num2번째 인덱스까지 잘라야 함. num2 포함!!!!!!!!
                                                   // num2도 포함!!! 해야 하므로 배열의 쿠기는 num2 - num1 + 1

        int index = 0;                             // answer 배열은 0번 인덱스부터 채워야 하므로.

        for (int i = num1; i <= num2; i++) {       // 배열 numbers는 num1인덱스부터 num2인덱스까지 확인.
                                                   // num2도 포함!! 해야 하므로 i <= num2

            answer[index] = numbers[i];

            index++;
        }
        return answer;
                  // 잘라낸 값들이 들어 있는 배열을 반환한다.
    }
}
