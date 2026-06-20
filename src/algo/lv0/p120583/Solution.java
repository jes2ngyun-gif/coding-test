package algo.lv0.p120583;

public class Solution {

    public int solution(int[] array, int n) {

        int answer = 0;

        for ( int i = 0; i < array.length; i++) {
            // 배열 전체를 하나씩 확인

            if (array[i] == n) {           // 현재 숫자가 n과 같다면

                answer++;                  // 갯수를 1 증가 
            }
        }
        return answer;
    }
}
