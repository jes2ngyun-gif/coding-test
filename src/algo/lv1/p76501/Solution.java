package algo.lv1.p76501;
// 음양 더하기
public class Solution {

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {

            if (signs[i] == true) {

                answer = answer + absolutes[i];

            } else {

                answer = answer - absolutes[i];
            }
        }
        return answer;
    }

}

// 다른 풀이: 삼항 연산자 -> 기본 if / else를 한 줄로 줄일 수 있음.
//public int solution(int[] absolutes, boolean[] signs) {
//
//    int answer = 0;
//
//    for (int i = 0; i < absolutes.length; i++) {
//
//        answer += signs[i] ? absolutes[i] : -absolutes[i];
//                        signs[i]가 true라면 absolutes[i]를 answer에 더하고,
//                        false라면 -absolutes[i]를 answer에 더한다.
//    }
//    return answer;
//}

// signs[i] ? absolutes[i] : -absolutes[i] -> 조건 ? 참일_때_값 : 거짓일_때_값