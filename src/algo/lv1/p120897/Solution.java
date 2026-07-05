package algo.lv1.p120897;
// 약수 구하기
public class Solution {

    public int[] solution(int n) {

        int count = 0;                  // 약수 개수 저장 변수

        for (int i = 1; i <= n; i++) {  // 1차 반복. 약수 개수 세기

            if (n % i == 0) {
                count++;                 // 약수 발견할 때마다 +1
            }
        }

        int[]answer = new int[count];    // 배열 생성

        int index = 0;

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {

                answer[index] = i;       // 배열에 저장

                index++;
            }
        }
        return answer;
    }
}


// 다른 풀이
// 컬렉션 활용. ArrayList는 자동으로 크기가 늘어나므로 한 번만 반복하면 된다.
//ArrayList<Integer> list = new ArrayList<>();
//
//for (int i = 1; i <= n; i++) {
//
//        if (n % i == 0) {
//        list.add(i);
//    }
//            }
