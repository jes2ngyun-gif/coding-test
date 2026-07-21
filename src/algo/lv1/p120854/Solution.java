package algo.lv1.p120854;

public class Solution {

    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
                // strlist 배열의 원소 개수만큼 결과 배열을 만든다.

        for (int i = 0; i < strlist.length; i++) {      // strlist 배열의 첫 번째 원소부터 마지막 원소까지 하나씩 확인한다.
            answer[i] = strlist[i].length();            // i번째 문자열의 길이를 구해서 answer 배열의 i번째 위치에 저장한다.

        }
        return answer;
    }
}

