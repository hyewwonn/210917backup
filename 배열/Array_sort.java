package �迭;

import java.util.Scanner;

public class Array_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int score[] = new int[10];
		int temp;
		
		for(int i = 0; i<score.length; i++) {
			System.out.print("����"+(i+1)+" �Է� : ");
			score[i] = scan.nextInt();
		}
		for(int i = 0; i<score.length-1; i++) {
			for(int j = i+1; j<score.length; j++) {
				if(score[i]>score[j]) {
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		System.out.println("�������� ����");
		for(int i = 0; i<score.length; i++) {
			System.out.print(score[i]+"\t");
		}
		
		
	}

}
