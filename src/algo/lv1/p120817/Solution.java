package algo.lv1.p120817;

public class Solution {

    public double solution(int[] numbers) {

        int sum = 0;
            // 배열의 모든 숫자 합을 저장할 변수

        for (int i = 0; i < numbers.length; i++) {
            // i 를 0부터 시작해서 배열의 마지막 인덱스의 '전'까지 반복

            sum = sum + numbers[i];
            // 현재 인덱스의 값을 sum에 누적
        }

        return (double) sum / numbers.length;
             // 합계를 배열의 길이로 나누어 평균을 구하고 반환
             // double로 형변환하여 소수점까지 계산되도록 함

    }
}
