package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


/*
    1. 먼저 가장 간단한 방법은 String[][] 2차원 배열을 통해 각 배열에 나이와 이름을 저장한 뒤, 

    나이 순으로 정렬하는 방법이다. 이때 정렬방법은 Arrays.sort()에 
    
    Comparator 의 compare 메소드를 구현하여 사용자 정렬을 사용해서 쓸 수 있다.

    compare 메소드는 양의 정수, 0, 음의 정수 중 하나를 반환하며, 
    
    양의 정수일 경우만 두 객체의 위치를 바꿔주는 역할을 한다. 

     

    3.  우리가 자주 사용하는 StringBuilder 을 배열처럼 사용하여 Counting sort 형태로 사용할 수 있다.

    나이는 1 이상, 200 이하이므로 201 개의 StringBuilder 배열을 만들면 된다. 
    
    StringBuilder 객체를 하나의 타입으로 받아 사용할 수 있다. 
    
    또한 2번에 비해 더 좋은 점은 문자열을 append() 하여 문자를 이을 수 있기 때문에 
    
    우리가 카운팅 정렬을 하듯이 나이를 기준으로 배열에 입력받으면서, 
    
    같은 나이일 경우 이미 해당 인덱스에 존재하던 문자열 뒤에 append 하여 이어주기만 하면 성능 측면에서도 매우 좋아진다.

    참고 ; https://st-lab.tistory.com/113
*/


public class Main_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String [][] arr = new String [N][2];

        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr[i][0] = st.nextToken(); // 나이
            arr[i][1] = st.nextToken(); // 이름
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            // 나이순으로 정렬하기.
            @Override
            public int compare(String[] s1, String[] s2) {
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            }
        });

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
        }

        System.out.println(sb);
    }
    
}
