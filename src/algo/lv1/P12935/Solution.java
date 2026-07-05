package algo.lv1.P12935;
// 제일 작은 수 제거하기
public class Solution {

    public int[] solution(int[] arr) {

        if (arr.length ==1) {                   // 배열의 길이가 1이면, 가장 작은 수를 제거했을 때 아무것도 남지 않는다.
            return new int[]{-1};               // 문제 조건에서 이 경우에는 [-1]을 반환하라고 했으므로 바로 반환한다.
        }

        int min = arr[0];                       // 최솟값을 저장할 변수 min을 만든다.
                                                // 처음엔 배열의 첫 번째 값이 가장 작다고 가정한다.

        for (int i = 1; i < arr.length; i ++) {      // 배열의 두 번째 값부터 마지막 값까지 확인한다.
                                                     // arr[0]은 이미 min에 넣었으므로 i=1부터 시작해도 된다.

            if (arr[i] < min) {                  // 현재 값 arr[i]가 지금까지의 최솟값 min보다 작으면
                min = arr[i];                    // min을 현재 값으로 바꾼다.
            }
        }

        int[] answer = new int[arr.length - 1];    // 가장 작은 수 하나를 제거할 예정임. 원래 배열보다 길이가 1 작은 새 배열을 만든다.
        int index = 0;                             // 새 배열 answer에 값을 넣을 위치를 관리하는 변수.
                                                   // 원본 배열의 i와 새 배열의 index는 다를 수 있으므로 따로 둔다.

        for (int i = 0; i < arr.length; i++) {     // 원본 배열 arr를 처음부터 끝까지 다시 확인한다.
            if (arr[i] != min) {                   // 현재 값이 최솟값이 아니라면 새 배열에 넣는다.
                answer[index] = arr[i];            // answer의 index 위치에 arr[i] 값을 저장한다.
                index++;                            // 값을 하나 넣었으므로 다음 칸에 넣기 위해 index를 1증가시킨다.
            }
        }
        return answer;
            // 최솟값이 제거된 새 배열을 반환한다.

    }
}

// 다른 풀이 방법 : 최솟값의 "인덱스"를 찾는 방법 -> 최솟값이 있는 위치, 즉 최솟값 인덱스를 찾는 방법
//class Solution {
//    public int[] solution(int[] arr) {
//
//        if (arr.length == 1) {
//            return new int[]{-1};
//        }
//
//        int minIndex = 0;                           // 가장 작은 값의 "위치"를 저장할 변수. 처음엔 0번 인덱스의 값이 가장 작다고 가정한다.
//
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < arr[minIndex]) {
//                minIndex = i;
//            }
//        }
//
//        int[] answer = new int[arr.length - 1];
//        int index = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (i != minIndex) {
//                answer[index] = arr[i];
//                index++;
//            }
//        }
//
//        return answer;
//    }
//}


