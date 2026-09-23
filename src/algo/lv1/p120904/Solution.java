package algo.lv1.p120904;
// 숫자 찾기
public class Solution {
    public int solution(int num, int k) {
        int answer = 0;

        String number = String.valueOf(num);              // 정수 num을 문자열로 변환 / 예: 29183 -> "29183"
        char target = String.valueOf(k).charAt(0);        // 정수 k를 문자로 변환 / 예: 1 -> "1" -> '1'

        for (int i = 0; i < number.length(); i++) {       // 문자열의 첫번째 글자부터 마지막 글자까지 확인
            if (number.charAt(i) == target) {             // 현재 위치의 문자가 찾고 있는 target과 같은지 확인
                answer = i + 1;                           // 문자열의 인덱스는 0부터 시작하지만, 문제에서 원하는 자리는 1부터 시작하므로 +1
                break;                                    // 가장 처음 등장한 위치만 필요하므로 반복문 종료
            }
        }

        if (answer == 0) {                                 // 반복문이 끝났는데도 answer가 0이라면 k를 한번도 찾지 못했다는 뜻
            answer = -1;
        }

        return answer;                                     // 찾았다면 위치를, 못찾았다면 -1을 반환.
    }
}


// 다른 풀이 : indexOf() 활용 : 반복문을 직접 작성하지 않음

//class Solution {
//    public int solution(int num, int k) {
//        int answer = 0;
//
//        String number = String.valueOf(num);
//        String target = String.valueOf(k);
//
//        int index = number.indexOf(target);
//
//        if (index == -1) {
//            answer = -1;
//        } else {
//            answer = index + 1;
//        }
//
//        return answer;
//    }
//}