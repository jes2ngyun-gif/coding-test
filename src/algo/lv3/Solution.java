package algo.lv3;

import java.util.stream.IntStream;

// 삼총사
public class Solution {

    public int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length; i++) {           // 첫번째 학생을 고르는 인덱스. i는 첫 번째 학생의 인덱스


            for (int j = i + 1; j < number.length; j++) {   // j = i + 1 -> 두번째 학생은 첫번째 학생보다 뒤에 있는 학생만 골라야 하기 때문

                for (int k = j + 1; k < number.length; k++) { // k = j + 1 -> 세번째 학생은 두번째 학생보다 뒤에 있는 학생ㅇ만 골라야 하기 때문

                    int sum = number[i] + number[j] + number[k];

                    if (sum == 0) {     // 합이 0 이면  . 삼 총 사
                        answer ++;
                    }
                }
            }
        }
        return answer;
    }

}


//import java.util.stream.IntStream;
//
//class Solution {
//    public int solution(int[] number) {
//        return (int) IntStream.range(0, number.length)
//                .flatMap(i -> IntStream.range(i + 1, number.length)
//                        .flatMap(j -> IntStream.range(j + 1, number.length)
//                                .filter(k -> number[i] + number[j] + number[k] == 0)))
//                .count();
//    }
//}