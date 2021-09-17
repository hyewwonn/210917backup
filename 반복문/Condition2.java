package 반복문;

import java.util.Scanner;

public class Condition2 {
	/*학과와 반 출력*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hakbun;
		Scanner scan = new Scanner(System.in);
		System.out.print("학번 입력 : ");
		hakbun = scan.nextInt();
		
		if(hakbun>=1101 && hakbun<=1220) {
			System.out.print("뉴미디어소프트웨어과 ");
			if(hakbun-1100<=20) {
				System.out.println("1반");
			}
			else {
				System.out.println("2반");
			}
		}
		else if(hakbun>=1301 && hakbun<=1420) {
			System.out.print("뉴미디어웹솔루션과 ");
			if(hakbun-1300<=20) {
				System.out.println("3반");
			}
			else {
				System.out.println("4반");
			}
		}
		else if(hakbun>=1501 && hakbun<=1620) {
			System.out.print("뉴미디어디자인과 ");
			if(hakbun-1500<=20) {
				System.out.println("5반");
			}
			else {
				System.out.println("6반");
			}
		}
		else {
			System.out.println("미림 학생이 아닙니다.");
		}
	}

}
