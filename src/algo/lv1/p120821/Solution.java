package algo.lv1.p120821;
// 배열 뒤집기
    class Solution {
        public int[] solution(int[] num_list) {

            int[] answer = new int[num_list.length];

            for (int i = 0; i < num_list.length; i++) {

                answer[i] = num_list[num_list.length -1 -i];
            }

            return answer;
        }
    }


// answer[i] = num_list[num_list.length -1 -i];
// num_list.length -1을 하면 배열의 마지막 칸 번호가 나옴
// -i 를 하면 뒤에서부터 한 칸씩 앞으로 이동함.