package algo.lv1.p120889;

import java.util.Arrays;

// 삼각형의 완성조건(1)
public class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0];
        int total = 0;

             // 배열 반복하면서 전체 합 구하기, sides.length: 배열의 길이.
        for (int i = 0; i < sides.length; i++) {
            total = total + sides[i];

             // 반복하면서 가장 긴 변 구하기.
            if (sides[i] > max) {
                max = sides[i];
            }
        }

        int otherSum = total - max;

             // 삼각형 조건 검사하기.(가장 긴 변 < 나머지 두 변의 합)
        if (max < otherSum) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}

// 다른 풀이 : 배열 정렬 사용 -> 세 변을 오름차순으로 정렬하면 가장 긴 변은 항상 마지막에 온다.

//import java.util.Arrays;
//    public int solution(int[] sides) {
//
//        Arrays.sort(sides);               // sides 배열을 오름차순으로 정렬한다.
//
//        int longest = sides[2];           // 정렬 후 가장 긴 변은 sides[2]이다.
//
//        int otherSum = sides[0] + sides[1];    // 나머지 두 변은 sides[0], sides[1]이다.
//
//             // 가장 긴 변이 나머지 두 변의 합보다 작으면 삼각형 가능.
//        if (longest < otherSum) {
//            return 1;
//        } else {
//            return 2;
//        }
//    }
//}