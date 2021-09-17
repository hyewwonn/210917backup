package 반복문;

import java.util.Scanner;
/*0이 입력될 때까지 score를 입력 받아 입력이 완료돠면
점수의 합과 평균을 출력하는 프로그램을 작성하라.

해결방법
1. 점수, 합, 점수의 개수를 입력하는 변수
2. 점수입력, 누적합, 0이면 멈추기
3. 합, 평균(sum/count) 출력
*/
public class WhileScoreT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;	
		int score;
		int sum = 0;
		double avg;
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("점수 입력 : ");
			score = scan.nextInt();
			if(score == 0) break;
			count++;
			sum += score;
			
		}
		avg = sum/count;
		
		System.out.println("합 : "+sum);
		System.out.println("평균 : "+avg);
	}

}
