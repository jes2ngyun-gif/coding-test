package algo.lv0.p120814;

public class Solution {

    public int solution(int n) {


        int pizzaslice = 7;              // 피자 한 판은 7조각이다.

        int pizza = 0;                   // 필요한 피자 판 수를 저장할 변수

        if (n % pizzaslice == 0) {       // 사람 수가 7로 나누어 떨어지는 경우
                                         // pizza는 7의 배수

            pizza = n / pizzaslice;      // 필요한 피자 판 수는 몫과 같다.

        } else {

            pizza = n / pizzaslice + 1;    // 나머지가 존재하면 아직 못 먹는 사람이 있기 때문에 피자를 한 판 더 주문해야 함
        }

        return pizza;            // 필요한 피자 판 수 반환
    }


}
