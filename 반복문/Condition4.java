package 반복문;

import java.util.Scanner;

public class Condition4 {
	/*1-3 시간표*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;
		int time;
		Scanner scan = new Scanner(System.in);
		System.out.print("요일 입력(1~5) : ");
		day = scan.nextInt();
		
		if(day == 1) {
			System.out.print("교시 입력 : ");
			time = scan.nextInt();
			MonMethod(time);
		}
		else if(day == 2) {
			System.out.print("교시 입력 : ");
			time = scan.nextInt();
			TueMethod(time);
		}
		else if(day == 3) {
			System.out.print("교시 입력 : ");
			time = scan.nextInt();
			WedMethod(time);
		}
		else if(day == 4) {
			System.out.print("교시 입력 : ");
			time = scan.nextInt();
			ThuMethod(time);
		}
		else if(day == 5) {
			System.out.print("교시 입력 : ");
			time = scan.nextInt();
			FriMethod(time);
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	public static void MonMethod(int time){
		System.out.print("월요일 "+time+"교시 : ");
		switch(time) {
		case 1: case 2: System.out.println("JAVA"); break;
		case 3: System.out.println("성공적인 직업생활"); break;
		case 4: System.out.println("국어"); break;
		case 5: System.out.println("영어"); break;
		case 6: System.out.println("일본어"); break;
		case 7: System.out.println("사회"); break;
		default: System.out.println("잘못 입력하셨습니다.");
		}
	}
	public static void TueMethod(int time) {
		System.out.print("화요일 "+time+"교시 : ");
		switch(time) {
		case 1: System.out.println("영어"); break;
		case 2: System.out.println("일본어"); break;
		case 3: System.out.println("성공적인 직업생활"); break;
		case 4: System.out.println("국어"); break;
		case 5: System.out.println("한국사"); break;
		case 6: System.out.println("수학"); break;
		case 7: System.out.println("사회"); break;
		default: System.out.println("잘못 입력하셨습니다.");
		}
	}
	public static void WedMethod(int time) {
		System.out.print("수요일 "+time+"교시 : ");
		switch(time) {
		case 1: System.out.println("일본어"); break;
		case 2: System.out.println("IPM"); break;
		case 3: System.out.println("IPM"); break;
		case 4: System.out.println("WSM"); break;
		case 5: System.out.println("WSM"); break;
		case 6: System.out.println("자치"); break;
		case 7: System.out.println("자치"); break;
		default: System.out.println("잘못 입력하셨습니다.");
		}
	}
	public static void ThuMethod(int time) {
		System.out.print("목요일 "+time+"교시 : ");
		switch(time) {
		case 1: System.out.println("가정"); break;
		case 2: System.out.println("한국사"); break;
		case 3: System.out.println("체육"); break;
		case 4: System.out.println("IPM"); break;
		case 5: System.out.println("CG"); break;
		case 6: System.out.println("CG"); break;
		case 7: System.out.println("수학"); break;
		default: System.out.println("잘못 입력하셨습니다.");
		}
	}
	public static void FriMethod(int time) {
		System.out.print("금요일 "+time+"교시 : ");
		switch(time) {
		case 1: System.out.println("영어"); break;
		case 2: System.out.println("한국사"); break;
		case 3: System.out.println("JAVA"); break;
		case 4: System.out.println("WSM"); break;
		case 5: System.out.println("체육"); break;
		case 6: System.out.println("수학"); break;
		case 7: System.out.println("가정"); break;
		default: System.out.println("잘못 입력하셨습니다.");
		}
	}


}
