package 반복문;

import java.util.Scanner;

public class Condition4Q {
	/*요일과 시간을 입력받아 메서드로 시간표에 맞는 수업 출력하기
	 * 잘못된 입력애는 "잘못 입력하셨습니다" 출력*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;
		int time;
		Scanner scan = new Scanner(System.in);
		System.out.print("요일 입력(월-1, 화-2, 수-3, 목-4, 금-5) : ");
		day = scan.nextInt();
		
		if (day>=1 && day<=5) {
			System.out.print("교시 입력 : ");
			time = scan.nextInt();
			getDayTime(day, time);
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		}
	public static void getDayTime(int day, int time) {
		switch(day) {
		case 1:
			System.out.print("월요일 "+time+"교시 : ");
			switch(time) {
			case 1: System.out.println("수학"); break;
			case 2: System.out.println("영어"); break;
			case 3: System.out.println("국어"); break;
			case 4: System.out.println("체육"); break;
			default: System.out.println("잘못 입력하셨습니다.");
			} break;
		case 2:
			System.out.print("화요일 "+time+"교시 : ");
			switch(time) {
			case 1: System.out.println("체육"); break;
			case 2: System.out.println("수학"); break;
			case 3: System.out.println("한국사"); break;
			case 4: System.out.println("영어"); break;
			default: System.out.println("잘못 입력하셨습니다.");
			} break;
		case 3:
			System.out.print("수요일 "+time+"교시 : ");
			switch(time) {
			case 1: System.out.println("과학"); break;
			case 2: System.out.println("체육"); break;
			case 3: System.out.println("영어"); break;
			case 4: System.out.println("국어"); break;
			default: System.out.println("잘못 입력하셨습니다.");
			} break;
		case 4:
			System.out.print("목요일 "+time+"교시 : ");
			switch(time) {
			case 1: System.out.println("영어"); break;
			case 2: System.out.println("한국사"); break;
			case 3: System.out.println("수학"); break;
			case 4: System.out.println("과학"); break;
			default: System.out.println("잘못 입력하셨습니다.");
			} break;
		case 5:
			System.out.print("금요일 "+time+"교시 : ");
			switch(time) {
			case 1: System.out.println("국어"); break;
			case 2: System.out.println("과학"); break;
			case 3: System.out.println("체육"); break;
			case 4: System.out.println("한국사"); break;
			default: System.out.println("잘못 입력하셨습니다.");
			} break;
		}
	}

}
