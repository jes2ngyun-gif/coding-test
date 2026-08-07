package algo.lv1.p120811;

import java.util.Arrays;

// 중앙값 구하기
public class Solution {

    public int solution(int[] array) {
        int answer = 0;

        Arrays.sort(array);                   // 배열을 오름차순으로 정렬한다.{3, 1, -2} -> {-2, 1, 3}

        int middleIndex = array.length / 2;   // 배열의 가운데 인덱스를 구한다.

        answer = array[middleIndex];          // 정렬된 배열에서 가운데 위치의 값을 꺼낸다.

        return answer;
    }
}

// 다른 풀이 : 바로  return 해버리기
//
//  Arrays.sort(array);
//
//  return array[array.length / 2];

// 다른 풀이 : 직접 정렬 구현하기
//public int solution(int[] array) {
//
//    // 배열의 모든 위치를 하나씩 기준으로 잡는다.
//    for (int i = 0; i < array.length; i++) {
//
//        // i 다음 위치부터 끝까지 비교한다.
//        for (int j = i + 1; j < array.length; j++) {
//
//            // 앞의 값이 뒤의 값보다 크면 순서를 바꾼다.
//            // 이렇게 하면 작은 값이 앞쪽으로 이동한다.
//            if (array[i] > array[j]) {
//                int temp = array[i];
//                array[i] = array[j];
//                array[j] = temp;
//            }
//        }
//    }
//
//    // 정렬이 끝나면 가운데 인덱스의 값이 중앙값이다.
//    int middleIndex = array.length / 2;
//
//    // 중앙값을 반환한다.
//    return array[middleIndex];
//}



// 다른 풀이 : stream 사용 - 스트림을 사용해서 정렬한 뒤 중앙값을 구함.
//public int solution(int[] array) {
//
//    // array 배열을 Stream으로 바꾼 뒤 오름차순으로 정렬한다.
//    // 그리고 다시 int[] 배열로 만든다.
//    int[] sortedArray = Arrays.stream(array)
//            .sorted()
//            .toArray();
//
//    // 정렬된 배열의 가운데 인덱스를 구한다.
//    int middleIndex = sortedArray.length / 2;
//
//    // 가운데 값을 반환한다.
//    return sortedArray[middleIndex];
//}
