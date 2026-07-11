package algo.lv2.p12940;
// 최대공약수(gcd)와 최소공배수(lcm)
public class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];                  // answer[0]에는 최대공약수, answer[1]에는 최소공배수

        int min;                                    // n과 m중 더 작은 값을 저장할 변수

        if (n < m) {                                // n이 m보다 작으면 n이 더 작은 수이다.
            min = n;
        } else {
            min = m;                                // 그렇지 않으면 m이 n보다 작거나 같은 수이다.
        }

        int gcd = 1;                                // 공약수에는 최소한 1이 항상 있기 때문에 1로 시작해도 된다.

        for (int i = 1; i <= min; i++) {            // gcd는 두 수 중 작은 수 보다 클 수 없기 때문에 1부터 두 수 중 작은 수 min까지 반복.
            if (n % 1 == 0 && m % 1 == 0) {         // i가 n과 m을 나누어 떨어지게 한다면 i는 n과 m의 공약수이다.
                gcd = i;
            }
        }

        int lcm = n * m / gcd;                      // lcm은 두 수의 곱을 gcd로 나누면 구할 수 있다.

        answer[0] = gcd;
        answer[1] = lcm;

        return answer;
    }
}
