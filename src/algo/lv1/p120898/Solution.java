package algo.lv1.p120898;
// 편지. return - > 필요한 편지지의 최소 가로 길이
public class Solution {

    public int solution(String message) {
        int answer = 0;

        answer = message.length() * 2;

        return answer;
    }
}
// 다른 풀이 : 반복문으로 직접 글자 수 세기!

//class Solution {
//    public int solution(String message) {
//        int count = 0;
//
//        // message의 첫번째 글자부터 마지막 글자까지 반복한다.
//        for (int i = 0; i < message.length(); i++) {
//            // 글자 하나를 만날 때마다 count를 1 증가시킨다.
//            count++;
//        }
//        // 글자 수에 2를 곱해서 반환한다.
//        return count * 2;
//    }
//}