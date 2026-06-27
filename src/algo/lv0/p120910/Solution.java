package algo.lv0.p120910;
// 세균 증식
public class Solution {

    public int solution(int n, int t) {         // n : 처음 세균 수, t : 지난 시간
        int answer = n;                         // 처음 세균 수는 n이므로 answer도 n에서 시작해야 한다.

        for (int i = 0; i < t; i++) {           // t시간 동안 세균이 2배씩 늘어나므로, 이 반복문은 정확히 t번 실행되어야 함.

            answer = answer *2;                 // 기존 answer값에 2를 곱한 뒤 다시 answer에 저장한다.

        }

        return answer;
    }
}
//  반복문이 t번 실행된다 : 시간복잡도 O(t)

// 마지막에 return 해야 하는 값은? t시간 후 세균 수
// 그걸 구하려면?? 현재 세균 수를 저장할 변수
// 그 변수는 어디서 시작?? n
// 어떻게 바뀜? 매시간 2배
// 몇 번 반복??  t번!!!!!!!!!!
