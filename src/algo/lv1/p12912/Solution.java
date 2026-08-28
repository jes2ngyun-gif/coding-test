package algo.lv1.p12912;
// 두 정수 사이의 합
public class Solution {

    public long solution(int a, int b) {
        long answer = 0;

               // Math.min()은 두 숫자 중 작은 값을 반환.
        int start = Math.min(a, b);
               // Math.max()는 두 숫자 중 큰 값을 반환.
        int end = Math.max(a, b);

        for (int i = start; i <= end; i = i + 1) {
            answer = answer + i;
        }
        return answer;
    }

}
