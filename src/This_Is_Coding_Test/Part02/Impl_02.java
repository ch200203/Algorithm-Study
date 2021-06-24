package This_Is_Coding_Test.Part02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// 시각
// 정수 N이 입력 되면 00시 00분 00초 부터 N시 59분 59초 까지 3이 하나라도
// 포함이 되는 경우의 수를 구하시오

public class Impl_02 {
/*	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수 N을 입력해주세요 : ");
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		
		for (int i = 0; i <= n ; i++) {
			for (int j = 0; j < 60; j++) {
				for (int k = 0; k < 60; k++) {
					if (n % 10 == 3 || j / 10 == 3 || j % 10 == 3 || k / 10 == 3 || k % 10 == 3){
						count++;
					}
				}
			}
		}
		
		System.out.println("3이 포함된 횟수 : " + count);
		
	}*/
	
	public static boolean check(int h, int m, int s) {
        if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // H를 입력받기 
        int h = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i <= h; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    // 매 시각 안에 '3'이 포함되어 있다면 카운트 증가
                    if (check(i, j, k)) cnt++;
                }
            }
        }

        System.out.println(cnt);
    }

}
