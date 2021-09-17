package 반복문;

import java.util.Scanner;

public class Repetition2 {
	/*10팩짜리 렌즈를 썼는지 안 썼는지 입력받고 남은 렌즈 개수를 출력*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lens = 10;
		int answer;
		Scanner scan = new Scanner(System.in);
		while(lens != 0) {
			System.out.print("오늘 렌즈를 사용했으면 1, 사용하지 않았으면 2 : ");
			answer = scan.nextInt();
			
			if(answer == 1) {
				System.out.println("렌즈를 사용했습니다.");
				lens --;
			}
			else {
				System.out.println("렌즈를 사용하지 않았습니다.");
			}
			
			switch(lens) {
			case 0: System.out.println("남은 렌즈가 없습니다."); break;
			default: System.out.println("렌즈가 "+lens+"개 남았습니다."); System.out.println();
			}
		}
			
	}

}
