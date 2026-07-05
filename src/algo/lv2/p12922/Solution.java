package algo.lv2.p12922;
// 수박수박수~
public class Solution {

    public String solution(int n) {
        String answer = "";                   // 처음에는 아무 글자도 없으므로 빈 문자열("")로 시작한다.

        for (int i = 0; i < n; i++) {         // 길이가  n인 문자열을 만들어야 하므로 n번 반복한다. i는 0부터 시작해서 n-1 까지 증가한다.

            if (i % 2 == 0) {                 // i를 2로 나눴을 때 나머지가 0이면 짝수번째 위치.
                                               // 0번째, 2번째, 4번째... 위치에는 "수"가 와야 한다.
                answer = answer + "수";        //  answer 뒤에 "수"를 이어 붙인다.
                                              // 예: "" -> "수", "수박" -> "수박수"


            } else {
                answer = answer + "박";        // i가 짝수가 아니라면 홀수 번째 위치이다.
            }                                  // 1번째, 3번째, 5번째... 위치에는 "박"이 와야 한다.

        }
        return answer;
                           // 반복문이 끝나면 길이가 n인 "수박수박...." 문자열이 완성된다.
    }

}


