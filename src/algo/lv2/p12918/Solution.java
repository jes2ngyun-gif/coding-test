package algo.lv2.p12918;
// 기본 문자열 다루기
public class Solution {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {            // 문자열의 길이가 4도 아니고 6도 아니면 false 반환
            return false;
        }

        for (int i = 0; i < s.length(); i++) {               // 문자열 첫번째 문자부터 마지막 문자까지 하나씩 확인
            char ch = s.charAt(i);                           // i번째 문자를 꺼낸다.

            if (ch < '0' || ch > '9') {                      // 숫자 문자는 '0'부터 '9' 사이에 있어야 한다. 현재 문자가 숫자인지 확인하는 조건문
                return false;                                // 이 범위에서 벗어나면 숫자가 아니므로 false 반환
            }
        }
        return true;
                        // 길이 조건 통화했고,
                        // 모든 문자가 숫자였으므로 true 반환
    }
}
