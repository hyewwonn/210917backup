package 반복문;

import java.util.Scanner;

public class Repetition4 {
	/*입력한 수의 모든 약수 구하기*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		n=scan.nextInt();
		
		System.out.print(n+"의 약수는 ");
		for(int i = 1; i<=n; i++) {
			if(n%i == 0) {
				System.out.print(i+" ");
			}
			else {
				continue;
			}
		}
		System.out.println("입니다.");
	}

}
