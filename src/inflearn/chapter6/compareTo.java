package inflearn.chapter6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class compareTo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        ArrayList<Point> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            arr.add(new Point(x, y));
        }

        Collections.sort(arr);

        for (Point point : arr) {
            System.out.println(o.x + " " + o.y);
        }

    }
}

// 좌표 정렬 클래스
class Point implements Comparable<Point> {
    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 정렬하는 기준을 잡아주는 메소드
    @Override
    public int compareTo(Point o) {
        // this -> o 이순서 대로(오름차순) 정렬이 되려면 return 값이 음수
        // o -> this 내림차순.
        if(this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}
