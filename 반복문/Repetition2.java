package �ݺ���;

import java.util.Scanner;

public class Repetition2 {
	/*10��¥�� ��� ����� �� ����� �Է¹ް� ���� ���� ������ ���*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lens = 10;
		int answer;
		Scanner scan = new Scanner(System.in);
		while(lens != 0) {
			System.out.print("���� ��� ��������� 1, ������� �ʾ����� 2 : ");
			answer = scan.nextInt();
			
			if(answer == 1) {
				System.out.println("��� ����߽��ϴ�.");
				lens --;
			}
			else {
				System.out.println("��� ������� �ʾҽ��ϴ�.");
			}
			
			switch(lens) {
			case 0: System.out.println("���� ��� �����ϴ�."); break;
			default: System.out.println("��� "+lens+"�� ���ҽ��ϴ�."); System.out.println();
			}
		}
			
	}

}
