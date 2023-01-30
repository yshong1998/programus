package level_0.hongyeseok.q120862;

import java.util.Arrays;

/**
 * 정수 배열 numbers가 매개변수로 주어집니다.
 * numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * -10,000 ≤ numbers의 원소 ≤ 10,000
 * 2 ≤ numbers 의 길이 ≤ 100
 *
 * 입출력 예
 * numbers	                    result
 * [1, 2, -3, 4, -5]	        15
 * [0, -31, 24, 10, 1, 9]	    240
 * [10, 20, 30, 5, 5, 20, 5]	600
 */
public class q120862 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {10, 20, 30, 5, 5, 20, 5};
        System.out.println(sol.solution(numbers));
    }
}

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[numbers.length - 2] * numbers[numbers.length - 1]);
    }
}