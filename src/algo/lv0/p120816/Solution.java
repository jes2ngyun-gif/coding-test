package algo.lv0.p120816;

public class Solution {

    public int solution(int slice, int n) {


//    int pizza = 1;
//
//    while (pizza * slice < n) {
//
//        pizza++;
//    }
//
//    return pizza;
//    }

        // 다른 풀이
        int pizza = 1;                    // 피자 판 수

        int totalSlice = pizza * slice;   // 현재 피자 조각 수의 배수

        while (totalSlice < n) {          // 피자 조각 수의 배수가 사람 수 보다 작다면 아직 모든 사람이 먹을 수 없기 때문에 반복.

            pizza++;                     // 피자를 한 판 추가한닷

            totalSlice = pizza * slice;    // 피자 조각 수의 배수를 다시 계산한다
        }
        return pizza;                // 모든 사람이 한 조각 이상 먹을 수 있게 될 때의 피자 판 수를 반환한다.
    }
}


// 피자 조각의 배수가 사람 수 n 보다 크거나 같아질 때 모두 한 조각씩 먹을 수 있음.

