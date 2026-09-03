package algo.lv1.p12948;
// 핸드폰 번호 가리기
public class Solution {

        public String solution(String phone_number) {
        String answer = "";


              // 반복을 한 번 실행한 뒤에는 i에 1을 더해서 다음 문자로 이동한다.
        for (int i = 0; i < phone_number.length(); i++) {

              // 현재 위치 i가 마지막 4자리가 시작하는 위치보다 앞에 있는지 확인한다.
              // 예를들어 전화번호 길이가 11이라면: 11 - 4 = 7
              // 0~6번은 가리고 7~10번은 그대로 사용한다.
            if (i < phone_number.length() -4) {

                     // 마지막 4자리보다 앞에 있는 문자이므로 원래 숫자 대신 "*"를 answer에 붙인다.
                answer = answer + "*";
            } else{

                     // 마지막 4자리에 해당하므로 원래 전화번호의 현재 문자를 그대로 가져와 answer 뒤에 붙인다.
                answer = answer + phone_number.charAt(i);
            }
        }
        return answer;
              // 모든 문자를 처리한 뒤 완성된 전화번호를 반환한다.
              // 가릴 부분 + 그대로 둘 마지막 4자리
    }

}

// 다른 풀이: StringBuilder -> String을 매번 새로 만드는 대신, 문자열을 이어 붙이기 위한 전용 도구를 사용할 수 있다.

//public String solution(String phone_number) {
//
//    StringBuilder answer = new StringBuilder();
//
//    for (int i = 0; i < phone_number.length(); i = i + 1) {
//
//        if (i < phone_number.length() - 4) {
//
//            answer.append("*");
//
//        } else {
//
//            answer.append(phone_number.charAt(i));
//        }
//    }
//
//    return answer.toString();
//}
//
//StringBuilder는 쉽게 말하면 문자열 조립 상자다.