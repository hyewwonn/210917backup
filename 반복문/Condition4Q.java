package �ݺ���;

import java.util.Scanner;

public class Condition4Q {
	/*���ϰ� �ð��� �Է¹޾� �޼���� �ð�ǥ�� �´� ���� ����ϱ�
	 * �߸��� �Է¾ִ� "�߸� �Է��ϼ̽��ϴ�" ���*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;
		int time;
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�(��-1, ȭ-2, ��-3, ��-4, ��-5) : ");
		day = scan.nextInt();
		
		if (day>=1 && day<=5) {
			System.out.print("���� �Է� : ");
			time = scan.nextInt();
			getDayTime(day, time);
		}
		else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
		}
	public static void getDayTime(int day, int time) {
		switch(day) {
		case 1:
			System.out.print("������ "+time+"���� : ");
			switch(time) {
			case 1: System.out.println("����"); break;
			case 2: System.out.println("����"); break;
			case 3: System.out.println("����"); break;
			case 4: System.out.println("ü��"); break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			} break;
		case 2:
			System.out.print("ȭ���� "+time+"���� : ");
			switch(time) {
			case 1: System.out.println("ü��"); break;
			case 2: System.out.println("����"); break;
			case 3: System.out.println("�ѱ���"); break;
			case 4: System.out.println("����"); break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			} break;
		case 3:
			System.out.print("������ "+time+"���� : ");
			switch(time) {
			case 1: System.out.println("����"); break;
			case 2: System.out.println("ü��"); break;
			case 3: System.out.println("����"); break;
			case 4: System.out.println("����"); break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			} break;
		case 4:
			System.out.print("����� "+time+"���� : ");
			switch(time) {
			case 1: System.out.println("����"); break;
			case 2: System.out.println("�ѱ���"); break;
			case 3: System.out.println("����"); break;
			case 4: System.out.println("����"); break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			} break;
		case 5:
			System.out.print("�ݿ��� "+time+"���� : ");
			switch(time) {
			case 1: System.out.println("����"); break;
			case 2: System.out.println("����"); break;
			case 3: System.out.println("ü��"); break;
			case 4: System.out.println("�ѱ���"); break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			} break;
		}
	}

}
