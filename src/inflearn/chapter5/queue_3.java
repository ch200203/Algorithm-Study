package inflearn.chapter5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(solution_2(n, m, arr));

        scan.close();
        
    }


    // 등급이 같은 경우를 처리할 수 없음....
    public static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int target = arr[m];

        Queue<Integer> queue = new LinkedList<>();

        for (int i : arr) queue.offer(i);

        while(!queue.isEmpty()) {
            int p = queue.poll();
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > p) queue.offer(p);
            }

            answer++;
            if(p == target) return answer;
        }

        return answer;
    }

    public static int solution_2(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(new Person(i, arr[i]));
        }

        while(!queue.isEmpty()) {
            Person tmp = queue.poll();
            for (Person person : queue) {
                if(person.priority > tmp.priority) {
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }

            if(tmp != null) {
                answer++;
                if(tmp.id == m) return answer;
            }
        }

        return answer;
    }
}


class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}
