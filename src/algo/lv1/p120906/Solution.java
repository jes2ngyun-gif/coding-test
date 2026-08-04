package algo.lv1.p120906;
// 자릿수 더하기 : 정수의 각 자리 숫자를 분리해서 더하는 문제
public class Solution {

    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
                  // n이 0이 되면 더 이상 꺼낼 자리 숫자가 없다는 뜻이다.
            int digit = n % 10;
                  // n의 가장 오른쪽 자리 숫자를 꺼낸다.
                  // digit : n에서 꺼낸 현재 자리 숫자를 의미함.
            answer = answer + digit;
            n = n / 10;
                  // n의 가장 오른쪽 자리 숫자를 제거한다.
        }
        return answer;
    }

}
