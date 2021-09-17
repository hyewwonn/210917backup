package 배열;

import java.util.Scanner;

public class Array_max {
	/*10명의 점수를 입력 받아 최고점수를 받은 학생을 결정하는 프로그램을 작성하라.
	 * 1.Scanner 를 통해 입력 받아 score 배열에 점수를 저장하라.
	 * 2.score 배열은 정수형이고 길이는 10이다.
	 * 3.최대값을 결정하기 위한 변수 max를 사용하라.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] score = new int[10];
		int max = 0;
		
		for(int i = 0; i<score.length; i++) {
			System.out.print("점수 입력 : ");
			score[i] = scan.nextInt();
			while(score[i]>100 || score[i]<0) {
				System.out.println("에러!!!");
				System.out.print("재입력 : ");
				score[i] = scan.nextInt();
			}//유효성체크
			if( score[i] > max ) {
				max = score[i];
			}
			
		}
		//출력부
		System.out.println("=======점수=======");
		for(int i = 0; i<score.length;  i++) {
			System.out.println("점수"+(i+1)+" : "+score[i]); 
		}
		System.out.println("최고점수 : "+max);
		
	}

}
