package �迭;

import java.util.Scanner;

public class Array2_score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = new int[5][3];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<score.length; i++) {//��		
			for(int j = 0; j<score[i].length; j++) {//��
				System.out.print(i+1+"�� ");
				switch(j+1) {
				case 1: System.out.print("�ϼ��� �Է� : "); break;
				case 2: System.out.print("â�Ǽ� �Է� : "); break;
				case 3: System.out.print("���ص� �Է� : "); break;
				}
				score[i][j] = scan.nextInt();
				while(score[i][j]<0 || score[i][j]>=20) {
					System.out.print("���Է� : ");
					score[i][j] = scan.nextInt();
				}
				
			}
			System.out.println();
			
		}
		getSum(score);
		//
	}//�Է�
	
	public static void getSum(int score[][]) {
		int[] sum = new int [score.length];
		for(int i = 0; i<score.length; i++) {
			for(int j = 0; j<score[i].length; j++) {
				sum[i] += score[i][j];
			}
			System.out.println(sum[i]);
		}
		
	}//�հ�
	
	public static int Grade(int sum) {
		int max = 0;
		if(sum > max) {
			max = sum;
		}
		return(max);
	}//���

}
