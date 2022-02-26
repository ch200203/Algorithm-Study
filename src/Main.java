import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int n = 5;
		int [] lost = {2, 4};
		int [] reverse = {1,3,5};
		System.out.println(solution(n, lost, reverse));
	} 
	
	
	/**
	 * @author cheolhwan
	 * @param n  전체 학생수
	 * @param lost 체육복을 잃어버린 학생 수
	 * @param reverse 여벌 체육복을 가진 학생 수
	 * @return answer 체육 수업을 들을 수 있는 학생 수
	 *
	 */
	public static int solution(int n, int[] lost, int[] reverse) {
		int answer = n -lost.length;
		
		Arrays.sort(lost);
		Arrays.sort(reverse);
		
		// 1. 여벌 체육복을 가져온 학생이 도둑 맞은 경우 제외
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reverse.length; j++) {
				if(lost[i] == reverse[i]) {
					answer++;
					lost[i] = -1;
					reverse[i] = -1;
					break;
				}
			}
		}
		
		// 2. 도난 당한 학생에게 체육복을 빌려주는 경우
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reverse.length; j++) {
				if(lost[i] - 1 == reverse[j] || lost[i] + 1 == reverse[j]) {
					answer++;
					reverse[j] = -1;
					break; // 더 이상 빌려줄 수 없으므로 break를 검
				}
			}
		}
		
		
		return answer;
	}

}
