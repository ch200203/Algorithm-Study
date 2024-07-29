package algorithm.Graph;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        int[] dataArray = { 5, 11, 13, 19, 22, 38, 42 };
        System.out.println("검색할 데이터를 입력하세요");
        Scanner scan = new Scanner(System.in);
        int search = Integer.parseInt(scan.nextLine().trim());

        int result = binarySearch(dataArray, search);
        if (result == -1)
            System.out.println("데이터를 찾지 못하였습니다");
        else
            System.out.println("데이터의 위치는 " + (result + 1) + "번 째입니다.");

        scan.close();

    }

    // 반복문으로 구현
    private static int binarySearch(int[] arr, int search) {
        int low = 0;
        int mid = 0;
        int high = arr.length;

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] < search) {
                low = mid + 1;
            } else if (arr[mid] > search) {
                high = mid - 1;
            } else
                return mid;
        }
        return -1;
    }

    // 재귀로 구현
    private static int binarySearch2(int[] arr, int search, int left, int right) {
        if (left <  right) {
            return -1;
        }

        // 배열의 가운데
        int mid = left + (right - left) / 2;

        if (arr[mid] == search) {
            return mid;
        } else if (arr[mid] < search) {
            return binarySearch2(arr, search, mid + 1, right);
        } else { // arr[mid] > search
            return binarySearch2(arr, search, left, mid - 1);
        }
    }

}

