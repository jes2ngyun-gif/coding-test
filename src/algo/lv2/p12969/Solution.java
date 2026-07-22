package algo.lv2.p12969;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();             // 첫번째 입력값은 가로 길이. 한 줄에 별 몇 개 출력할지 의미함.
        int m = sc.nextInt();             // 두번째 입력값은 세로 길이. 별 줄을 몇 줄 출력할지 의미함.

        for (int i = 0; i < m; i++) {      // 바깥 for문은 세로 줄 개수를 담당함. m 번 반복하면 m줄을 출력할 수 있다.
            for (int j = 0; j < n; j++) {  // 안쪽 for문은 한 줄 안의 별 개수를 담당. n번 반복하면 별을 n개 출력할 수 있다.

                System.out.print("*");
            }

            System.out.println();
        }
    }
}
