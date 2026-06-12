package algo.lv0.p87389;
//나머지가 1이 되는 수 찾기
public class Solution {

    public int solution(int n) {

        int answer= 0;

        for (int x = 2; x < n; x++) {

            if (n % x == 1) {
                answer = x;
                break;
            }
        }

        return answer;
    }

}

// 10 % 1 = 0
// 모든 수를 1로 나눈 나머지는 0이다. → 1은 볼 필요도 없음
// 그래서 int x = 2 부터 시작.

// 만약 x = n 일때, x % n = 0이다.→ 1이 될 수 없음

