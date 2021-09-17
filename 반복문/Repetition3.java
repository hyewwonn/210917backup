package 반복문;

import java.util.Scanner;

public class Repetition3 {
	/*교통카드 잔액과 할인을 입력받아 얼마나 탈 수 있는지 출력*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int card;
		int sale;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("교통카드 잔액 입력 : ");
		card = scan.nextInt();
		System.out.print("일반:1, 청소년:2, 어린이:3 입력 : ");
		sale = scan.nextInt();
		
		if(sale == 1) {
			while(card >= 1199) {
				card -= 1200;
				count ++;
			}//while
		}//if
		else if(sale == 2) {
			while(card >= 1199) {
				card -= 720;
				count ++;
			}//while
		}//else if
		else {
			while(card >= 1199) {
				card -= 450;
				count ++;
			}//while
		}//else
		
		System.out.println("앞으로 "+count+"번 승차할 수 있습니다.");
	}

}
