package �ݺ���;

import java.util.Scanner;

public class Condition2 {
	/*�а��� �� ���*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hakbun;
		Scanner scan = new Scanner(System.in);
		System.out.print("�й� �Է� : ");
		hakbun = scan.nextInt();
		
		if(hakbun>=1101 && hakbun<=1220) {
			System.out.print("���̵�����Ʈ����� ");
			if(hakbun-1100<=20) {
				System.out.println("1��");
			}
			else {
				System.out.println("2��");
			}
		}
		else if(hakbun>=1301 && hakbun<=1420) {
			System.out.print("���̵�����ַ�ǰ� ");
			if(hakbun-1300<=20) {
				System.out.println("3��");
			}
			else {
				System.out.println("4��");
			}
		}
		else if(hakbun>=1501 && hakbun<=1620) {
			System.out.print("���̵������ΰ� ");
			if(hakbun-1500<=20) {
				System.out.println("5��");
			}
			else {
				System.out.println("6��");
			}
		}
		else {
			System.out.println("�̸� �л��� �ƴմϴ�.");
		}
	}

}
