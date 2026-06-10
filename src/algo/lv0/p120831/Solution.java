package algo.lv0.p120831;
// 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
public class Solution {
    public int solution(int n) {

        int sum = 0;             // 짝수를 더한 값을 저장하는 변수 sum

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {

                sum = sum + i;
            }
        }

        return sum;
    }

}
