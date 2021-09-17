package 반복문;

import java.util.Scanner;

public class PassCount {
	/*해결방법
	 * 1. 통과한 사람, 점수 변수
	 * 2. 80점 넘으면 카운트
	 * 3. 음수 입력 시 종료
	 * 4. 통과한 사람 수 출력
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int count = 0;
			int score;
			Scanner scan = new Scanner(System.in);
			
			while (true ) {
				System.out.print("점수 입력 : ");
				score = scan.nextInt();
				if (score>=80) {
					count++;
				}
				if (score < 0) {
					break;
				}
			}
			System.out.println("통과자는 "+count+"명입니다.");
	}

}
