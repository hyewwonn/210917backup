package �ݺ���;

import java.util.Scanner;

public class Repetition1 {
	/*���ڸ� �Է¹޾� �� ���� ���*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.print("n�� ��� : ");
		n = scan.nextInt();
		
		for(int i = 1; i<=9; i++) {
			System.out.println(n+" x "+i+" = "+n*i);
		}
	}

}
