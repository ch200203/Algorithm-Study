package inflearn.chapter2;

public class Array_8 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {92, 92, 92, 100, 76};
        solution(n, arr);
    }

    public static void solution(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            int rank  = 1;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]) rank++;
            }
            System.out.print(rank + " ");
        }   
    }
}
