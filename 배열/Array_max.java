package �迭;

import java.util.Scanner;

public class Array_max {
	/*10���� ������ �Է� �޾� �ְ������� ���� �л��� �����ϴ� ���α׷��� �ۼ��϶�.
	 * 1.Scanner �� ���� �Է� �޾� score �迭�� ������ �����϶�.
	 * 2.score �迭�� �������̰� ���̴� 10�̴�.
	 * 3.�ִ밪�� �����ϱ� ���� ���� max�� ����϶�.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] score = new int[10];
		int max = 0;
		
		for(int i = 0; i<score.length; i++) {
			System.out.print("���� �Է� : ");
			score[i] = scan.nextInt();
			while(score[i]>100 || score[i]<0) {
				System.out.println("����!!!");
				System.out.print("���Է� : ");
				score[i] = scan.nextInt();
			}//��ȿ��üũ
			if( score[i] > max ) {
				max = score[i];
			}
			
		}
		//��º�
		System.out.println("=======����=======");
		for(int i = 0; i<score.length;  i++) {
			System.out.println("����"+(i+1)+" : "+score[i]); 
		}
		System.out.println("�ְ����� : "+max);
		
	}

}
