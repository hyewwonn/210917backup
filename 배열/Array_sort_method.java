package �迭;

import java.util.Scanner;

public class Array_sort_method {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[10];
		Scanner scan = new Scanner(System.in);
		
		//�Է� �κ�
		for (int i=0; i<score.length; i++) {
			System.out.print((i+1)+"��° ���� �Է� : ");
			score[i] = scan.nextInt();
		}
		
		do_sort(score);
		
	}
	public static void do_sort(int score[]) {
		int temp;
		for(int i = 0; i<score.length-1; i++) {
			for(int j = i+1; j<score.length; j++) {
				if(score[i]>score[j]) {
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		System.out.println("====������ (������������)====");
		for(int i = 0; i<score.length; i++) {
			System.out.println(score[i]);
		}
	}

}
