package �ݺ���;

import java.util.Scanner;

public class Condition5 {
	/*�Է¹��� ���� �Ҽ����� �ƴ��� ���*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("2�̻��� ���� �Է� : ");
		n = scan.nextInt();
		
		switch(n) {
		case 2: System.out.println(n+"��/�� �Ҽ��Դϴ�."); break;
		default:
			for(int i = 2; i<=n-1; i++) {
				if(n%i==0) {
					count ++;
					break;
				}
				else {
					continue;
				}
			}
			if(count == 0) {
				System.out.println(n+"��/�� �Ҽ��Դϴ�."); break;
			}
			else {
				System.out.println(n+"��/�� �Ҽ��� �ƴմϴ�.");
			}
		}
		
	}

}