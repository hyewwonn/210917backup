package �迭;

import java.util.Scanner;

public class MaxAndMin_1306 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int num;
		int max = 0;
		int min = 2147483647;
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		n = scan.nextInt();

		System.out.print("���� �Է� : ");
		for(int i = 1; i<=n; i++) {

			num = scan.nextInt();
	         
			if(num>max) {
				max = num;
			}
			if(num<min) {
				min = num;
			}
		}

		System.out.println("�ּڰ� : "+min+", "+"�ִ� : "+max);
	}

}