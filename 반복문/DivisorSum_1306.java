package 반복문;

import java.util.Scanner;

public class DivisorSum_1306 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("수 입력 : ");
		n = scan.nextInt();
		
		for(int i = 1; i<=n; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		System.out.println("숫자 "+n+"의 약수의 합 : "+sum);
	}

}
