package algo.lv2.p120926;
// 특정문자를 제거한 문자열 반환?
public class Solution {

    public String solution(String my_string, String letter) {
        String answer = "";
                 // Letter가 제거된 최종 문자열을 저장할 변수

        char target = letter.charAt(0);
                 // Letter는 길이가 1인 문자열이다.

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            if (ch != target) {
                answer = answer + ch;
                // 현재 문자가 제거할 문자 target과 다르면 제거 대상이 아니므로 answer에 붙인다.
            }
        }
        return answer;
    }
}
