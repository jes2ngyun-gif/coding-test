package algo.lv1.p12947;
// 하샤드 수
public class Solution {

    public boolean solution(int x) {

        int sum = 0;

        // 원래 숫자를 문자열로 변환한다.
        String number = String.valueOf(x);

        // 문자열의 각 글자를 하나씩 확인한다.
        for (int i = 0; i < number.length(); i++) {

            // char 형태의 숫자를 실제 int 숫자로 변환한다.
            // number.charAt(i)의 결과는 문자'1'
            // '1' - '0' -> 1 // '8' - '0' -> 8
            int digit = number.charAt(i) - '0';

            // 자릿수를 합한다.
            sum += digit;
        }

        // 하샤드 수인지 검사한다.
        return x % sum == 0;
    }
}


// 다른 풀이
//public boolean solution(int x) {
//    int sum = 0;

      // 원래 숫자 x는 마지막에 다시 사용해야 하므로 x를 직접 변경하지 않고
      // 자릿수를 하나씩 확인하기 위한 복사본 temp를 만든다.
//    int temp = x;
//
      // temp가 0이 되면 모든 자릿수를 확인했다는 뜻
//    while (temp > 0) {
//        sum = sum + (temp % 10);               // temp % 10 -> 가장 마지막 자릿수를 가져올 수 있다.
//        temp = temp / 10;                      // temp / 10 -> 가장 마지막 자릿수를 제거할 수 있다.
//    }
//
//    return x % sum == 0;

        // 원래 숫자 x를 자릿수의 합 sum으로 나눈다.
        // 나머지가 0이면 하샤드 수이므로 true,
        // 나머지가 0이 아니면 false를 반환
//}