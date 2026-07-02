package algo.lv0.p12910;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] arr, int divisor) {
        int count = 0;                                 // divisor로 나누어떨어지는 숫자가 `몇 개`인지 세기 위한 변수

        for (int i = 0; i < arr.length; i++) {         // array 배열의 첨부터 끝까지 하나씩 확인
                                                       // arr[i]를 divisor로 나누었을 때 나머지가 0이면 나누어떨어짐
            if (arr[i] % divisor == 0) {
                count++;                               // 조건에 맞는 숫자를 찾으면 count +1
            }
        }

        if (count == 0) {                              // 조건에 맞는 숫자가 없다면, d로 나눠 떨어지는 숫자가 없다면.
            return new int[]{-1};                      // -1 하나만 들어 있는 배열을 반환한다.
        }

        int[] answer = new int[count];                 // 조건에 맞는 숫자의 갯수만큼 정답 배열을 만든다
        int index = 0;                                 // answer 배열의 몇 번째 칸에 값을 넣을지 관리하는 변수

        for (int i = 0; i < arr.length; i ++) {         // 다시 array 배열을 첨부터 끝까지 확인

            if (arr[i] % divisor == 0) {                // divisor로 나누어 떨어지는 값만 골라낸다.
                answer[index] = arr[i];                 // 조건에 맞는 값을 answer 배열의 현재 index 위치에 넣는다.
                index++;                                // 다음 값을 넣을 수 있도록 index를 1 증가시킴
            }
        }

        Arrays.sort(answer);                             // array 배열을 오름차순으로 정렬한다.

        return answer;                                   // 조건에 맞는 배열을 반환한다.
    }
}

// 다 른 풀 이

//---
// 1. ArrayList 사용

//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class Solution {
//
//    public int[] solution(int[] arr, int divisor) {
//        ArrayList<Integer> list = new ArrayList<>();             // Integer는 int를 객체처럼 다루기 위한 `래퍼 클래스`
//
//        for (int i = 0; i < arr.length; i ++) {                  // arr 배열의 첨부터 끝까지 하나씩 확인
//
//            if (arr[i] % divisor == 0) {                         // arr[i]를 divisor로 나누었을 때 나머지가 0이면 나누어 떨어짐
//                list.add(arr[i]);                                // 조건에 맞는 값을 list에 추가
//            }
//        }
//
//        if (list.size() == 0) {                                  // 조건에 맞는 값이 하나도 없다면 list는 비어있다.
//            return new int[]{-1};                                // 조건에 따라 -1하나만 들어 있는 배열을 반환한다.
//        }
//
//        Collections.sort(list);                                  // list 안에 있는 값들을 오름차순으로 정렬한다.
//
//        int[] answer = new int[list.size()];                     // 문제의 반환 타입이 int[]이므로, list와 같은 크기의 배열을 만든다
//
//        for (int i = 0; i < list.size(); i++) {                  // list에 들어 있는 값을 answer 배열로 하나씩 옮긴다.
//            answer[i] = list.get(i);                             // list.get(i)는 list의 i번째 값을 꺼내는 소스다.
//        }
//        return answer;
//    }
//}


//---
// 2. Stream 사용

//import java.util.Arrays;
//
//class Solution {
//    public int[] solution(int[] arr, int divisor) {
//        int[] answer = Arrays.stream(arr)
//                .filter(num -> num % divisor == 0)
//                .sorted()
//                .toArray();
//
//        if (answer.length == 0) {
//            return new int[]{-1};
//        }
//
//        return answer;
//    }
//}