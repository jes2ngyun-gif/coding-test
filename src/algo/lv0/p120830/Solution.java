package algo.lv0.p120830;
 // 양꼬치
public class Solution {

    public int solution(int n, int k) {
        int totalPrice = 0;
        int meatPrice = n * 12000;

        int serviceDrink = n / 10;
        int payDrinkCount = k - serviceDrink;
        int drinkPrice = payDrinkCount * 2000;

        totalPrice = meatPrice + drinkPrice;

        return totalPrice;

    }

}
