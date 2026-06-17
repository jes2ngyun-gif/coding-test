package algo.lv0.p120825;

class Solution {

    public String solution(String my_string, int n) {

        String answer = "";


        for (int i = 0; i < my_string.length(); i++) {   // 문자열 길이만큼 반복
            char ch = my_string.charAt(i);               // i번째 문자 꺼내기

            for (int j = 0; j < n; j++) {                // 문자를 n번 반복
                answer = answer + ch;                    // answer에 문자 붙이기, 문자열 계속 새로 만들기
            }
        }

        return answer;
    }

}