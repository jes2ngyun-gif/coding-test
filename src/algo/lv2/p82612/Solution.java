package algo.lv2.p82612;

public class Solution {
    public long solution(int price, int money, int count) {           // price: 기본 이용료, money: 내가 가진 돈, count: 놀이기구를 탈 횟수

        long answer = 0;
        long totalPrice = 0;

        for (int i = 1; i <= count; i++) {                        // 1번째 탑승부터 count번째 탑승까지 반복
            totalPrice = totalPrice + price * i;
        }

        if (totalPrice > money) {
            answer = totalPrice - money;
        } else {
            answer = 0;
        }
        return answer;
    }
}
