package algo.lv0.p12948;

public class Solution {

    public String solution(String s) {
        String answer = "";

        int length = s.length();        // 문자열 s의 길이를 구한다. 예: "abcde"의 길이는 5, "qwer"의 길이는 4

        int middle = length / 2;        // 문자열의 가운데 위치를 계산한다. int끼리 나누면 소수점은 버려진다.

        if (length % 2 == 0) {                              // 문자열 길이가 짝수인지 확인한다.
            answer = s.substring(middle - 1, middle + 1);   // Length % 2 == 0 이면 짝수이다.
                        // 짝수 길이일 때는 가운데 글자 2개를 가져와야 한다. 예: "qwer"
                        // 인덱스 : q=0, w=1, r=3. middle은 2
                        // 따라서 middle -1부터 middle 까지 가져와야 한다.
                        // substring(1, 3)은 인덱스 1부터 2까지 가져온다

        } else {
            answer = s.substring(middle, middle + 1);
                        // 홀수 길이일 때는 가운데 글자 1개만 가져오면 된다. 예: "abcde"
                        // 인덱스 : a=0, b=1, c=2, d=3, e=4. middle은 2
                        // substring(2, 3)은 인덱스 2의 글자만 가져온다.
        }

        return answer;
                         // 계산한 가운데 글자를 반환한다.
    }


}
