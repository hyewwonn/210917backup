package �ݺ���;

import java.util.Scanner;

public class Repetition4 {
	/*�Է��� ���� ��� ��� ���ϱ�*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		n=scan.nextInt();
		
		System.out.print(n+"�� ����� ");
		for(int i = 1; i<=n; i++) {
			if(n%i == 0) {
				System.out.print(i+" ");
			}
			else {
				continue;
			}
		}
		System.out.println("�Դϴ�.");
	}

}
