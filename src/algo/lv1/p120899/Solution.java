package algo.lv1.p120899;
// 가장 큰 수 찾기
public class Solution {

    public int[] solution(int[] array) {
        int[] answer = new int[2];
                                    // 가장 큰 수와 그 인덱스를 담을 배열을 만든다.
                                    // answer[0]에는 가장 큰 수, answer[1]에는 가장 큰 수의 인덱스

        int max = array[0];
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {    // 현재 값이 지금까지의 최댓값보다 크면
                max = array[i];      // 최댓값을 현재 값으로 바꾼다.
                maxIndex = i;        // 최댓값의 위치도 현재 인덱스로 바꾼다.
            }
        }

        answer[0] = max;
        answer[1] = maxIndex;

        return answer;
    }
}
