package algo.lv0.p120819;

public class Solution {

    public int[] solution(int money) {
        int price = 5500;

        int count = money / price;

        int change = money % price;

        int [] answer = {count, change};

        return answer;
    }

}
// [마실 수 있는 잔 수, 남은 돈]
