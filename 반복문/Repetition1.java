package 반복문;

import java.util.Scanner;

public class Repetition1 {
	/*숫자를 입력받아 그 단을 출력*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.print("n단 출력 : ");
		n = scan.nextInt();
		
		for(int i = 1; i<=9; i++) {
			System.out.println(n+" x "+i+" = "+n*i);
		}
	}

}
