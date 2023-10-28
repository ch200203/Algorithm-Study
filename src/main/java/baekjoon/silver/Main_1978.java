package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1978 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];
        int count = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            if (isPrime(Integer.parseInt(st.nextToken())) )  count++;
        }

        System.out.println(count);

    }

    // 내가 생각했던 알고리즘 => 효율성이 좋지 않음. O(N)
    public static boolean isPrime(int num)  {
        // 1 은 소수가 아니다.
        if(num == 1){
            return false;	
        }
        
        // 2 ~ Number-1 까지 중 나누어 떨어지는 약수가 있는지 판별
        // Number = 2 의 경우는 자연스럽게 for문을 검사하지 않게 됨
        
        for(int i = 2; i < num; i++) {
            if(num % i == 0) return false;
            
        }
        
        // 위 두 조건에 걸리지 않으면 소수다.
        return true;
    }

    // 1. 제곱근을 이용한 풀이방법
    public static void solution () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();	// N 은 쓰지 않음.	
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		while(st.hasMoreTokens()) {
        
			// 소수인경우 true, 아닌경우 false   
			boolean isPrime = true;
			
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 1) {
				continue;
			}
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				count++;
			}
		}
		System.out.println(count);
    }
    
    // 2. 에라토스테네스의 체 를 이용하는 방법 => 효율성 갑 
    
    // 1 ~ Max 범위
    // 소수인 수 = false
    // 소수가 아닌 수 = true
    
    public boolean[] make_prime(int Max) {
    
        boolean[] Prime = new boolean[Max + 1];	// 0 부터 시작하므로 +1
    
        // 0 과 1 은 소수가 아니므로 true
        Prime[0] = true;
        Prime[1] = true;
        
        
        for(int i = 2; i <= Math.sqrt(Max); i++) {
    
            // 이미 걸러진 배열일 경우 다음 반복문으로 건너뜀
            if(Prime[i] = true) {
                continue;
            }
            
            /*
            정석대로라면 j = i * 2 부터 시작이지만 
            이미 2의 배수가 걸러졌기때문에
            i 의 제곱수부터 시작해도 된다.
            */
            
            for(int j = i * i; j < Max + 1; j = j + i) {
                Prime[j] = true;
            }
        }
    
        // 배열 index 가 소수라면 false 로, 아니라면 true 로 완성됨
        
        return Prime;
        // 1 ~ 1000까지 에라토스테네스의 체를 이용하여 소수만 체크되어있는 배열을 구한 뒤, 숫자를 입력받으면 배열의 index 와 비교하여 판별할 수도 있다.
    }
}
