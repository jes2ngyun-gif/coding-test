package algo.lv2.p68935;

// 3진법 뒤집기
public class Solution {

    public int solution(int n) {
        int answer = 0;

        String reversed = "";                          // 나머지를 구하는 순서가 이미 "뒤집힌 3진법" 순서가 된다.

        while (n > 0) {                                // n을 3으로 나누면서 3진법의 각 자리 숫자를 구한다.
            reversed = reversed + (n % 3);             // n을 3으로 나눈 나머지를 문자열 뒤에 붙인다.
                                                       // 이 나머지가 3진법의 한 자리 숫자가 된다.
            n = n / 3;                                 // n을 3으로 나눈 몫으로 바꾼다. 그래야 다음 자리 숫자를 구할 수 있다.
        }


        for (int i = 0; i < reversed.length(); i++) {   // reversed 문자열을 왼쪽부터 한 글짜씩 읽는다. 이 문자열은 뒤집힌 3진법 숫자이다.
            int digit = reversed.charAt(i) - '0';       // 문자 하나를 꺼내서 숫자로 바꾼다. 예: '2' - '0' = 2
            answer = answer * 3 + digit;                // 3진법 숫자를 10진법으로 바꾸는 계싼
        }
        return answer;
    }
}


// 다른 풀이
//public int solution(int n) {
//    int answer = 0;
//
//    while (n > 0) {                      // n이 0보다 큰 동안 반복
//
//        answer = answer * 3 + (n % 3);   // 기존 answer에 3을 곱하고, 현재 n을 3으로 나눈 나머지를 더한다.
//                                         // 이 계산이 "뒤집힌 3진법을 10진법으로 바꾸는 과정"과 같음.
//
//        n = n / 3;                       // 다음 자리 계산을 위해 n을 3으로 나눈다.
//    }
//    return answer;
//}
