package algo.lv0.p12944;

public class Solution {

    public double solution(int[] arr) {

        int sum = 0;

        for(int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];
        }

        return (double) sum / arr.length;

    }
}
