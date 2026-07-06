package algo.lv2.p77884;

public class Solution {

    public int solution(int left, int right) {
        int answer = 0;
                    // 짝수 개수의 약수를 가진 수는 더하고, 홀수 개수의 약수를 가진 수는 빼면서 누적

        for (int number = left; number <= right; number ++) {
                                         // left부터 right까지 숫자를 하나씩 검사한다. 예: left = 13, right = 17이면, number는 13, 14, 15, 16, 17 순서로 바뀜

            int divisorCount = 0;
                    // 현재 숫자 number의 약수 개수를 저장하는 변수

            for (int divisor = 1; divisor <= number; divisor++) {
                                         // 1부터 number까지 하나씩 나누어보면서 divisor가 number의 약수인지 검사한다.

                if (number % divisor == 0) {               // num이 div로 나눠떨어지면 div는 num의 약수이다.

                    divisorCount++;                        // 약수를 하나 찾았으므로 약수 개수를 1 증가시킴
                }
            }

            if (divisorCount % 2 == 0) {                   // 약수 개수가 짝수라면 현재 숫자를 더한다.
                answer = answer + number;
            } else {                                       // 약수 개수가 홀수라면 현재 숫자를 뺀다.
                answer = answer - number;
            }
        }
        return answer;
    }


}
