package baekjoon.gold;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_12015 {
    static int n;
    static List<Integer> list;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) arr[i] = scan.nextInt();

        solution(n, arr);

        scan.close();
    }

    private static void solution(int n, int[] arr) {
        list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int node = arr[i];

            if(list.size() == 0 || list.get(list.size() - 1) < node) {
                list.add(node);
            } else {
                int index = findIndex(node, 0, list.size() - 1);
                list.set(index, node);
            }
        }

        System.out.println(list.size());

    }

    private static int findIndex(int n, int left, int right) {
        int lt = left;
        int rt = right;

        do {
            int mid = (lt + rt) / 2;
            if(n == list.get(mid)) return mid;

            if(n < list.get(mid)) rt = mid - 1;
            else lt = mid + 1;

        } while(lt <= rt);  

        return lt;
    }
}
