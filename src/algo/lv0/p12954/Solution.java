package algo.lv0.p12954;

public class Solution {
    public long[] solution(int x, int n) {


        long[] answer = new long[n];
                // n 개의 숫자를 담을 long 배열을 생성한다.
                // 문제에서 반환 타입이 long[]이므로 int[]가 아니라 long[]을 사용해야 함

        for ( int i = 0; i < n; i++) {
                // 배열의 인덱스는 0부터 시작하므로 i는 0부터 (n-1)까지 반복한다.
                // 그래서 i+1을 곱한다.
                // x와 i+1은 int이므로, 먼저 x를 long으로 형변환해서 안전하게 계산한다.

            answer[i] = (long)x * (i + 1);
        }

        return answer;
                // 모든 값이 채워진 배열을 반환한다.
    }
}
// for ( int i = 0; i < n; i++) -> 반복문이 n번 돈다. n개의 값을 하나씩 채운다. -> 시간복잡도: O(n)


