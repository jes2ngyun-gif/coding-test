package algo.lv2.p12950;
// 행렬의 덧셈
public class Solution {

                  // int [][] -> 2차원 정수 배열
        public int[][] solution(int[][] arr1, int[][] arr2) {

            int[][] answer = new int[arr1.length][arr1[0].length];             // 문제에서 arr1과 arr2의 행과 열의 크기가 같다고 함.-> 배열의 크기도 같음.
                                  // [행 갯수]      [0번째 행의 열 개수]
            for (int i = 0; i < arr1.length; i++) {                            // 바깥 for문은 행을 이동한다. i는 행 번호를 의미함

                for (int j = 0; j < arr1[i].length; j++) {                     // 안쪽 for문은 열을 이동한다. j는 열 번호를 의미함.

                    answer[i][j] = arr1[i][j] + arr2[i][j];
                                    // 같은 위치에 있는 값을 더해서 answer의 같은 위치에 저장

                }
            }
            return answer;
        }

}
