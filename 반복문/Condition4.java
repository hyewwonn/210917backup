package �ݺ���;

import java.util.Scanner;

public class Condition4 {
	/*1-3 �ð�ǥ*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;
		int time;
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�(1~5) : ");
		day = scan.nextInt();
		
		if(day == 1) {
			System.out.print("���� �Է� : ");
			time = scan.nextInt();
			MonMethod(time);
		}
		else if(day == 2) {
			System.out.print("���� �Է� : ");
			time = scan.nextInt();
			TueMethod(time);
		}
		else if(day == 3) {
			System.out.print("���� �Է� : ");
			time = scan.nextInt();
			WedMethod(time);
		}
		else if(day == 4) {
			System.out.print("���� �Է� : ");
			time = scan.nextInt();
			ThuMethod(time);
		}
		else if(day == 5) {
			System.out.print("���� �Է� : ");
			time = scan.nextInt();
			FriMethod(time);
		}
		else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
	}
	public static void MonMethod(int time){
		System.out.print("������ "+time+"���� : ");
		switch(time) {
		case 1: case 2: System.out.println("JAVA"); break;
		case 3: System.out.println("�������� ������Ȱ"); break;
		case 4: System.out.println("����"); break;
		case 5: System.out.println("����"); break;
		case 6: System.out.println("�Ϻ���"); break;
		case 7: System.out.println("��ȸ"); break;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	public static void TueMethod(int time) {
		System.out.print("ȭ���� "+time+"���� : ");
		switch(time) {
		case 1: System.out.println("����"); break;
		case 2: System.out.println("�Ϻ���"); break;
		case 3: System.out.println("�������� ������Ȱ"); break;
		case 4: System.out.println("����"); break;
		case 5: System.out.println("�ѱ���"); break;
		case 6: System.out.println("����"); break;
		case 7: System.out.println("��ȸ"); break;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	public static void WedMethod(int time) {
		System.out.print("������ "+time+"���� : ");
		switch(time) {
		case 1: System.out.println("�Ϻ���"); break;
		case 2: System.out.println("IPM"); break;
		case 3: System.out.println("IPM"); break;
		case 4: System.out.println("WSM"); break;
		case 5: System.out.println("WSM"); break;
		case 6: System.out.println("��ġ"); break;
		case 7: System.out.println("��ġ"); break;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	public static void ThuMethod(int time) {
		System.out.print("����� "+time+"���� : ");
		switch(time) {
		case 1: System.out.println("����"); break;
		case 2: System.out.println("�ѱ���"); break;
		case 3: System.out.println("ü��"); break;
		case 4: System.out.println("IPM"); break;
		case 5: System.out.println("CG"); break;
		case 6: System.out.println("CG"); break;
		case 7: System.out.println("����"); break;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	public static void FriMethod(int time) {
		System.out.print("�ݿ��� "+time+"���� : ");
		switch(time) {
		case 1: System.out.println("����"); break;
		case 2: System.out.println("�ѱ���"); break;
		case 3: System.out.println("JAVA"); break;
		case 4: System.out.println("WSM"); break;
		case 5: System.out.println("ü��"); break;
		case 6: System.out.println("����"); break;
		case 7: System.out.println("����"); break;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}


}
