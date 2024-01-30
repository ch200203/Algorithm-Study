package codility;

import java.util.HashSet;
import java.util.Set;

public class Solution_1 {

    public static void main(String[] args) {

    }

    private static void solution(int[] A) {
        Set<Integer> set = new HashSet<>();

        for(int num : A) {
            set.add(num);
        }
    }
}
