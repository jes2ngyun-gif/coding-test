package algo.lv1.p120903;
//  배열의 유사도
// 두 배열의 모든 조합을 확인하려면 : 반복문 안에 반복문이 필요 -> 중첩 반복문(향상된 for문)

public class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (String str1 : s1) {        // s1의 문자열을 하나씩 꺼낸다.
                                        // s1 안에 있는 문자열을 하나씩 꺼내서 str1이라고 부르겠다.

            for (String str2 : s2) {    // 꺼낸 str1과 비교하기 위해 s2의 문자열도 하나씩 꺼낸다.

                if (str1.equals(str2)) { // 두 문자열의 내용이 같은지 확인한다.
                    answer++;             // 같다면 공통 원소를 하나 발견한 것. -> answer를 1 증가시킴
                }
            }
        }
        return answer;                   // 공통 문자열의 총개수를 반환한다.
    }
}



