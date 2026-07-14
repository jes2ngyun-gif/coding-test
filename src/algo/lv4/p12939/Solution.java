package algo.lv4.p12939;
// 최댓값과 최솟값
public class Solution {

    public String solution(String s) {
        String[] numbers = s.split(" ");              // 문자열 s를 공백 기준으로 자른다. 예: "1 2 3 4" -> {"1", "2", "3", "4"}

        int min = Integer.parseInt(numbers[0]);             // 첫번째 값을 숫자로 바꿔서 최솟값 기준으로 잡는다.
        int max = Integer.parseInt(numbers[0]);             // 첫번째 값을 숫자로 바꿔서 최댓값 기준으로 잡는다.

        for (int i = 0; i < numbers.length; i++) {          // numbers 배열 안에 있는 문자열 숫자들을 하나씩 확인한다.
            int num = Integer.parseInt(numbers[i]);         // 현재 문자열 숫자를 int 숫자로 바꾼다.

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }
        return min + " " + max;
    }
}
