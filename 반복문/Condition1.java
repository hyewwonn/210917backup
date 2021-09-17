package 반복문;

import java.util.Scanner;

public class Condition1 {
	/*티켓값 출력*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seat;
		Scanner scan = new Scanner(System.in);
		System.out.print("좌석 선택(VIP=1, R=2, S=3, A=4) : ");
		seat = scan.nextInt();
		
		switch(seat) {
		case 1: System.out.println("VIP석 : 150,000"); break;
		case 2: System.out.println("R석 : 130,000"); break;
		case 3:	System.out.println("S석 : 100,000"); break;
		case 4:	System.out.println("A석 : 70,000"); break;
		}
	}

}
