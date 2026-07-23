package algo.lv3.p68644;

import java.util.ArrayList;
import java.util.Collections;

// 두 개 뽑아서 더하기
public class Solution {

    public int[] solution(int[] numbers) {

             // 두 수를 더해서 만든 결과들을 저장할 리스트
             // 중복된 합은 넣지 않을 예정이다.
        ArrayList<Integer> sumList = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {           // 첫번째 숫자를 고르는 반복문

            for (int j = i + 1; j < numbers.length; j++) {   // 두번째 숫자를 고르는 반복문
                                                             // j 는 i + 1부터 시작.왜? 그래야 같은 숫자를 두 번 고르지 않고,
                                                             // 같은 조합을 중복해서 세지 않음.
                int sum = numbers[i] + numbers[j];
                  // 서로 다른 인덱스에 있는 두 수를 더한다.

                  // sumList에 아직 같은 합이 없다면 추가한다.
                if (!sumList.contains(sum)) {
                    sumList.add(sum);
                }
            }
        }

                   // 오름차순으로 정렬한다.
        Collections.sort(sumList);

                   // sumList에 들어 있는 개수만큼 배열을 만든다.
        int[] answer = new int[sumList.size()];

                   // ArrayList에 들어 있는 값을 int[] 배열로 옮긴다.
        for (int i = 0; i < sumList.size(); i++) {
            answer[i] = sumList.get(i);
        }
        return answer;
    }
}
