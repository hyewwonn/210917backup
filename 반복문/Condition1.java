package �ݺ���;

import java.util.Scanner;

public class Condition1 {
	/*Ƽ�ϰ� ���*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seat;
		Scanner scan = new Scanner(System.in);
		System.out.print("�¼� ����(VIP=1, R=2, S=3, A=4) : ");
		seat = scan.nextInt();
		
		switch(seat) {
		case 1: System.out.println("VIP�� : 150,000"); break;
		case 2: System.out.println("R�� : 130,000"); break;
		case 3:	System.out.println("S�� : 100,000"); break;
		case 4:	System.out.println("A�� : 70,000"); break;
		}
	}

}
