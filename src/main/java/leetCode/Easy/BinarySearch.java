package leetCode.Easy;

// BinarySearch
// https://leetcode.com/problems/binary-search/description/
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,0,3,5,9,12};
        int target = 9;

        int search = new BinarySearch().search(arr, target);
        System.out.println("search : " + search);
    }

    private int search(int[] arr, int target) {
        return binarySearch(arr, target, 0, arr.length - 1);
    }

    private int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, right);
        } else {
            return binarySearch(arr, target, left, mid - 1);
        }
    }
}
