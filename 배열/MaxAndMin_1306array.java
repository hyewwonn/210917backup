package �迭;

import java.util.Scanner;

public class MaxAndMin_1306array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int max = 0;
		int min = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		n = scan.nextInt();
		
		System.out.print("���� �Է� : ");
		for(int i = 0; i<n; i++) {
			int[] num = new int[n];
			
			num[i] = scan.nextInt();
			max = num[1];
			min = num[1];
			
			if(num[i]>max) {
				max = num[i];
			}
			
			if(num[i]<min) {
				min = num[i];
			}
		}

		System.out.println("�ּڰ� : "+min+", "+"�ִ� : "+max);
	}

}