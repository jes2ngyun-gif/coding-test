package algo.lv0.p120585;

public class Solution {

    public int solution(int[] array, int height) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {            // array 전체 순회
            if (array[i] > height) {                        // 머쓱이보다 크면
                answer++;                                   // 카운트 +1
            }
        }                                                   // 작거나 같으면 넘어감(else 필요없음)
        return answer;
    }

}


// 다른 풀이 1. 향상된 for문
//     public int solution(int[] array, int height) {
//          int answer = 0;
//
//          for ( int h : array) {                    // array에서 요소를 하나씩 꺼내서 h에 담기
//              if ( h > height) {                    // 꺼낸 값(h)이 머쓱이 키(height)보다 크면
//                  answer++;                         // 카운트+1
//          }
//     }                                              // 크지 않으면 아무것도 안 하고 다음 요소로 넘어감
//          return answer;                            // 다 세고 나서 반환
//}
// [향상된 for문 구조]                                   기본 for문     →  array[0], array[1], array[2] ... 인덱스로 접근
// for (자료형 변수명 : 배열명)                           향상된 for문   →  h, h, h ... 요소를 직접 꺼내서 접근
// → 배열의 첫 번째 요소부터 마지막 요소까지 자동으로 순회        -> 인덱스가 필요 없을 때 향상된 for문으로 훨씬 깔끕하게 쓸 수 있다.
// → 기본 for문에서 array[i] 라고 썼던 것을
//    h 라는 변수가 대신 받아줌
//
// 예) array = [149, 180, 192, 170] 이면
//    1번째 반복 : h = 149
//    2번째 반복 : h = 180
//    3번째 반복 : h = 192
//    4번째 반복 : h = 170


// 다른 풀이 2. Stream
//import java.util.Arrays; // Arrays.stream() 사용하려면 필요
//
//class Solution {
//    public int solution(int[] array, int height) {

        // [Stream 흐름]
        // Arrays.stream(array)  →  array를 스트림(데이터 흐름)으로 변환
        //        .filter(...)   →  조건에 맞는 요소만 걸러냄
        //        .count()       →  남은 요소의 개수를 셈
        //
        // 마치 "체"에 배열을 쏟아붓고, 조건을 통과한 것만 남겨서 세는 느낌!

//        return (int) Arrays.stream(array)  // [1단계] array를 스트림으로 변환
//                //         (데이터를 흘려보낼 파이프 연결)
//
//                .filter(h -> h > height)// [2단계] 조건 필터링
//                //  h -> h > height 의 의미 :
//                //  "요소를 h라고 부를 때, h가 height보다 크면 통과"
//                //  → h > height 가 true인 요소만 남김
//
//                .count();               // [3단계] 남은 요소 개수 반환
        //  count()는 long 타입이라 (int)로 형변환 필요
//    }
//}

// [배열]  →  stream()  →  filter()  →  count()
//데이터 투입   파이프 연결    조건 선별     개수 세기