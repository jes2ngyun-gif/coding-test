package algo.lv1.p12943;
// 콜라츠 추측
public class Solution {
    public int solution(int num) {


        int answer = 0;                      // 작업 횟수를 저장하는 변수
        long current = num;                  // 현재 계산 중인 숫자를 저장하는 변수
                                             // num은 int로 들어오지만, 홀수 계산에서 값이 커질 수 있으므로 long을 사용한다.



        while (current != 1) {                // current가 1이 될 때까지 반복. 1이면 반복x -> 바로 answer를 반환함

            if (answer == 500) {              // 500번 반복했는데도 1이 안됐다면, -1을 반환하고 메서드를 끝낸다.
                return -1;
            }

            if (current % 2 == 0) {           // 현재 숫자가 짝수라면 2로 나눈다
                current = current / 2;
            } else {                          // 현재 숫자가 홀수라면 3을 곱하고 1을 더한다
                current = current * 3 + 1;
            }

            answer++;                         // 짝/홀 규칙 중 하나를 수행했으므로 `작업 횟수`를 1증가시킨다
        }

        return answer;
                        // current가 1이 되면 반복문이 끝난다.
                        // 그때까지 수행한 `작업 획수`를 반환한다.
    }

}
