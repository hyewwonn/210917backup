package 반복문;

import java.util.Scanner;

/* 여성(입력이 1)이 입력될 때까지 입력을 받는 프로그램 작성*/
public class While_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;	
		int input;
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("성별 입력 : ");
			input = scan.nextInt();
			if(input == 1) break;
		}
	}

}
