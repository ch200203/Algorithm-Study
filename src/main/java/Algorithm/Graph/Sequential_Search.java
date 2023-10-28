package Algorithm.Graph;

import java.util.Scanner;

public class Sequential_Search {
    public static void main(String[] args) {
        int[] dataArray = { 7, 14, 2, 10, 11, 16 };

        System.out.println("검색할 데이터를 입력하세요");
        Scanner scan = new Scanner(System.in); 
        int search = Integer.parseInt(scan.nextLine().trim()); //데이터를 입력받습니다.
      
        int result = sequentialSearch(dataArray, search);


        if(result == -1)
            System.out.println("데이터를 찾지 못하였습니다");
        else
            System.out.println("데이터의 위치는 " + result + "번 째입니다.");
    }

    public static int sequentialSearch(int[] arr, int search) {
        for (int i = 0; i < arr.length; i++) { //순서대로 비교하기 위해 배열의 크기만큼 반복합니다.
            if (arr[i] == search) //비교할 데이터가 배열에 있으면 배열의 위치를 return하고, 없다면 -1을 return합니다.
                return i;
        }
        return -1;
    }

}