package level_0.hongyeseok.q120899;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 정수 배열 array가 매개변수로 주어질 때,
 * 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 1 ≤ array의 길이 ≤ 100
 * 0 ≤ array 원소 ≤ 1,000
 * array에 중복된 숫자는 없습니다.
 *
 * 입출력 예
 * array	result
 * [1, 8, 3]	[8, 1]
 * [9, 10, 11, 8]	[11, 2]
 */
public class q120899 {
    public static void main(String[] args) {
        int[] array = {1,8,3};
        System.out.println(Solution.solution(array)[0]);
        System.out.println(Solution.solution(array)[1]);
    }
}

class Solution {
    public static int[] solution(int[] array) {
        int[] answer = new int[2];
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            myMap.put(array[i],i);
        }
        Arrays.sort(array);
        int index = myMap.get(array[array.length-1]);
        answer[0] = array[array.length-1];
        answer[1] = index;
        return answer;
    }
}