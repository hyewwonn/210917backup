package �ݺ���;

import java.util.Scanner;

public class DivisorSum_1306 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		n = scan.nextInt();
		
		for(int i = 1; i<=n; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		System.out.println("���� "+n+"�� ����� �� : "+sum);
	}

}
