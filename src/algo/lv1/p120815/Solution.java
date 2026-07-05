package algo.lv1.p120815;
// 피자 나눠 먹기(2), answer: 피자 판 수, n: 사람 수
public class Solution {

    public int solution(int n) {

        int answer = 1;

        while ((6 * answer) % n != 0) {     //
            answer++;
        }

        return answer;
    }

}

//다른 풀이
//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//
//        for(int i = 1; i <= n; i++) {
//
//            if(i * 6 % n == 0) {
//                answer = i;
//                break;
//            }
//
//        }
//
//        return answer;
//    }
//}