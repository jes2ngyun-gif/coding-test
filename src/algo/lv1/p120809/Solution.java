package algo.lv1.p120809;

public class Solution {

    public int[] solution(int[] numbers) {

        int[] answer = new int[numbers.length];     // 길이가 number.length인 int 배열을 새로 만들어서 answer가 가리키게 한다.
                                                    // 즉, numbers와 똑같은 칸 수를 가진 새 창고를 하나 만든다.

        for (int i = 0; i < numbers.length; i++) {

            answer[i] = numbers[i] * 2;
        }

        return answer;
    }

}
