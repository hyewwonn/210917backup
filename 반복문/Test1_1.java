package 반복문;

import java.util.Scanner;

public class Test1_1 {
	public static void main(String[] args ) {
		int num;

		Scanner scan = new Scanner(System.in);
		System.out.print("데이터 입력 : ");
		num = scan.nextInt();

		for(int i = 1000; i<=1; i/=10) {
			System.out.println(num/i);
			
		}
	}

}
