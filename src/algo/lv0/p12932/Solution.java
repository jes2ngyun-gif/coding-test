package algo.lv0.p12932;
// 자연수 뒤집어 배열로 만들기
public class Solution {

    public int[] solution(long n) {

        String str = String.valueOf(n);
               // long 타입 숫자n을 문자열로 변환
               // 숫자를 각 자리별로 다루려면 문자열로 바꿔야 인덱스로 접근 가능. 예: 12345(long) -> "12345"(String)

        int[] answer = new int[str.length()];
               // 결과를 담을 int 배열 생성
               // 자리 수 만큼 배열 크기가 필요함 -> str.length() 사용
               // 예: "12345".length() = 5 -> int[5] 생성


        for (int i = 0; i < str.length(); i++) {                        // 반복문. 배열 인덱스 i를 0부터 `문자열 길이 전`까지 순서대로 증가
            answer[i] = str.charAt(str.length() - 1 - i) - '0';
                     // 문자열의 '뒤에서부터' 한 글자씩 꺼내서 answer[i]에 저장
                     // str.charAt(str.length() - 1 - i) : 뒤집기의 핵심 공식. 걍 암기
                     // -'0' : 문자(char)를 숫자(int)로 변환하는 공식. 걍 암기
                     // 예 : i = 0일 때, charAt(4) -> '5' -> '5' - '0' = 5

        }

        return answer;
                 // 완성된 배열 반환.
    }
}
