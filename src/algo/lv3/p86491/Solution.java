package algo.lv3.p86491;
// 최소 직사각형
// 명함이 다 들어가지만 가장 작은 지갑의 넓이 구하기
public class Solution {

    public int solution(int[][] sizes) {
        int maxLongSide = 0;     // 긴 쪽의 최댓값 저장
        int maxShortSide = 0;    // 짧은 쪽의 최댓값 저장

        for (int [] size : sizes) {        // size에는 명함 한 장의 크기가 들어옴. 예: {60, 50}

            int firstSide = size[0];       // 현재 명함의 두 길이를 꺼낸다.
            int secondSide = size[1];

            int longSide;
            int shortSide;


            if (firstSide >= secondSide) {    // 첫 번째 길이가 두번째 길이보다 크거나 같다면
                longSide = firstSide;         // 첫번째 길이를 긴 쪽으로 사용함
                shortSide = secondSide;
            } else {
                longSide = secondSide;        // 두 번째 길이가 더 크다면 드 번째 길이를 긴 쪽으로 사용함
                shortSide = firstSide;
            }

            if (longSide > maxLongSide) {      // 현재 긴 쪽이 기존 최댓값보다 크면 값을 변경한다.
                maxLongSide = longSide;
            }

            if (shortSide > maxShortSide) {     // 현재 짧은 쪽이 기존 최댓값보다 크면 값을 변경한다.
                maxShortSide = shortSide;
            }
        }

        return maxLongSide * maxShortSide;       // 지갑 넓이 반환

    }
}
