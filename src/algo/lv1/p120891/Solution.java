package algo.lv1.p120891;
// 3, 6, 9 게임
public class Solution {

    public int solution(int order) {
        int answer = 0;                       // 3, 6, 9를 발견한 횟수를 저장할 변수

        String number = String.valueOf(order);             // 정수 order를 문자열로 변환한다.
                                                           // 예: 29423 -> "29423"

        for (int i = 0; i < number.length(); i++) {
            char current = number.charAt(i);               // number의 i번째 문자 하나를 가져온다.
                                                           // 예: number가 "29423"이고 i가 1이면 current는 '9'

            if (current == '3' || current == '6' || current == '9') {
                answer++;

            }
        }
        return answer;
    }

}
