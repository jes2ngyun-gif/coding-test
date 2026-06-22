package algo.lv0.p120905;

import java.util.Arrays;

// n의 배수 고루기
 // numlist에서 n의 배수가 아닌 것들을 제거한 배열 리턴
public class Solution {

    public int[] solution(int n, int[] numlist) {

        int count = 0;                                        // n의 배수 갯수를 세기 위한 변수

        for ( int i = 0; i < numlist.length; i++) {           // numlist 배열을 처음부터끝까지 확인

            if(numlist[i] % n == 0) {                         // n으로 나누어떨어지면 n의 배수

                count++;                                      // n의 배수 발견 → count 1증가
            }
        }

        int[] answer = new int[count];                        // n의 배수의 개수만큼 배열 만들기

        int index = 0;                                        // answer 배열에 값을 넣을 취히 기억하는 변수

        for (int i = 0; i < numlist.length; i++) {            // 다시 numlist 배열을 처음부터 끝까지 확인

            if (numlist[i] % n == 0) {                        // 현재 숫자가 n의 배수인지 다시 확인

                answer[index] = numlist[i];                   // answer의 index 위치에 현재 숫자를 넣는다.

                index++;                                     // 다음 값을 다음 칸에 넣기 위해 index를 1 증가시킴
            }
        }
        return answer;                                          // n의 배수만 담긴 배열을 반환
    }


    // stream을 활용한 다른 풀이
//    public int[] solution(int n, int[] numlist) {
//        return Arrays.stream(numlist)                      // numlist 배열을 스트림으로 바꾼다.
//                                                              배열을 하나씩 흘려보내며 처리하는 상태로 만듬
//                     .filter(num -> num % n ==0)           // 각 숫자 num이 n의 배수인지 검사하고, 조건을 만족하는 숫자만 통과시킴.
//                                                              조건이 true인 값만 남긴다.
//                     .toArray();                           // 필터링된 결과를 다시 int[] 배열로 바꾼다.
//    }
//}
