package 배열;

import java.util.Scanner;

public class Array2_score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = new int[5][3];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<score.length; i++) {//행		
			for(int j = 0; j<score[i].length; j++) {//열
				System.out.print(i+1+"조 ");
				switch(j+1) {
				case 1: System.out.print("완성도 입력 : "); break;
				case 2: System.out.print("창의성 입력 : "); break;
				case 3: System.out.print("이해도 입력 : "); break;
				}
				score[i][j] = scan.nextInt();
				while(score[i][j]<0 || score[i][j]>=20) {
					System.out.print("재입력 : ");
					score[i][j] = scan.nextInt();
				}
				
			}
			System.out.println();
			
		}
		getSum(score);
		//
	}//입력
	
	public static void getSum(int score[][]) {
		int[] sum = new int [score.length];
		for(int i = 0; i<score.length; i++) {
			for(int j = 0; j<score[i].length; j++) {
				sum[i] += score[i][j];
			}
			System.out.println(sum[i]);
		}
		
	}//합계
	
	public static int Grade(int sum) {
		int max = 0;
		if(sum > max) {
			max = sum;
		}
		return(max);
	}//등수

}
