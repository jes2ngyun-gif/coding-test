package algo.lv2.p12917;

import java.util.Arrays;

// 문자열 내림차순으로 배치하기
public class Solution {

    public String solution(String s) {
        String answer = "";

        char[] chars = s.toCharArray();                 // 문자열 s를 문자 하나하나가 들어있는 배열로 바꾼다.
                                                        // 예: "Zbcdefg" → ['Z', 'b', 'c', 'd', 'e', 'f', 'g']
        Arrays.sort(chars);
                          // 문자 배열을 오름차순으로 정렬한다.
                          // 오름차순: 작은 문자 → 큰 문자
                          // Java에서는 대문자가 소문자보다 작게 취급된다.
                          // 예: ['Z', 'b', 'c', 'd', 'e', 'f', 'g']

        for (int i = chars.length -1; i >= 0; i--) {      // 근데 문제는 내림차순을 원함.  Arrays.sort(chars)는 오름차순 정렬만 해줌.
                                                          // 그래서 배열의 마지막 글자부터 첫 글자까지 거꾸로 읽는다.

            answer = answer + chars[i];
                          // 현재 위치의 문자를 answer 뒤에 붙인다.
                          // 예: "" + 'g' → "g"
                          // 예: "g" + 'f' → "gf"
        }

        return answer;
    }
}
