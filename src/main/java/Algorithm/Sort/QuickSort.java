package Algorithm.Sort;

import java.util.Arrays;

// Reference : https://st-lab.tistory.com/250
// 이코테 책 참고
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 0, 3, 1, 6, 2, 4, 8};
    }

    private void quickSort(int[] arr, int start, int end) {

        if(arr.length <= 1) { // 원소가 1개인 경우는 정렬이 필요없음.
            System.out.println(Arrays.toString(arr));
            System.exit(0);
        }

        int pivot = start; // pivot은 첫번째 원소
        int left = start + 1;
        int right = end;

        while(left <= right) {
            // pivot 보다 큰 데이터를 찾을 때 까지 반복
            while(left <= end && arr[right] >= arr[pivot]) {
                left += 1;
            }
            // pivot 보다 작은 데이터를 찾을 때 까지 반복
            while(right > start && arr[right] >= arr[pivot]) {
                right -= 1;
            }

            if(left > right) { // 엇갈렷다면 작은 데이터와 pivot을 교체
            }
        }

    }
}
