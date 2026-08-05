package algo.lv1.p120909;
// 제곱수 판별하기
public class Solution {

    public int solution(int n) {

        int answer = 2;                           // 처음에는 n이 제곱수가 아니라고 가정한다.

        for (int i = 1; i * i <= n; i++) {        // i를 1부터 1씩 증가시키면서 i*i값을 확인. i*i가 n보다 커지면 더 이상 확인할 필요 ㄴㄴ

            if (i * i == n) {                     // i를 제곱한 값이 n과 같다면 n은 제곱수다.
                answer = 1;
                break;
            }
        }
        return answer;
                  // 제곱수이면 1, 아니면 2를 반환한다.
    }

}



// 다른 풀이 : 바로 리턴해버리기
// public int solution(int n) {
//    for (int i = 1; i * i <= n; i++) {
//        if (i * i == n) {
//            return 1;
//        }
//    }
//    return 2;
// }
//
// -> 제곱수를 찾으면 바로 1반환, 끝까지 못찾으면 2반환
