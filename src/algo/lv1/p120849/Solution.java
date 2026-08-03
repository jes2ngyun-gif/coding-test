package algo.lv1.p120849;
// 모음(a, e, i, o, u) 제거한 문자열 반환
// 직접 조건문으로 모음 비교함.
public class Solution {

    public String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                answer = answer + ch;
            }
        }
        return answer;
    }


}
