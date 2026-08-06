package algo.lv1.p120839;
// 가위 바위 보
public class Solution {

    public String solution(String rsp) {
        String answer = "";

        for (int i = 0; i < rsp.length(); i++) {
            char ch = rsp.charAt(i);

            switch (ch) {
                case '2':
                    answer = answer + "0";
                    break;
                case '0':
                    answer = answer + "5";
                    break;
                case '5':
                    answer = answer + "2";
                    break;
            }
        }

        return answer;
    }

}
