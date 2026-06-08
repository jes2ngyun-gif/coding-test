package algo.lv0.p120806;
// 두 수의 나눗셈
// 정수 `num1`과 `num2`가 매개변수로 주어질 때, `num1`을 `num2`로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록  solution 함수를 완성해라.
public class Solution {

    public int solution(int num1, int num2) {
        double a = (double) num1 / num2 * 1000;                  // num1을 double형으로 바꿔 소수점 계산이 가능하도록 만듬.
        return (int) a;                                          // 결과를 int형으로 변환하여 반환한다.
    }
}
