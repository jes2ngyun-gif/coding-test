package algo.lv1.p12934;

// 정수 제곱근 판별
public class Solution {

    public long solution(long n) {
        long answer = 0;

                 // n의 제곱근을 구하고 정수형으로 변환
        long sqrt = (long) Math.sqrt(n);

                 // sqrt를 다시 제곱했을 때 n과 같으면 n은 완전제곱수
        if (sqrt * sqrt == n) {

                 // 다음 정수의 제곱을 answer에 저장
            answer = (sqrt + 1) * (sqrt + 1);

        } else {
            answer = -1;
                  // 완전제곱수가 아니면 -1

        }

        return answer;
    }

}
