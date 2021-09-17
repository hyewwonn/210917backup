package JS;

import java.util.Scanner;

public class JsIf1 {

	public static void main(String args[]){
		int gender;
		int score;
		Scanner scan = new Scanner(System.in);
		System.out.print("자바 점수 입력 : ");
		score = scan.nextInt( );
	   
		if (score>=94){ 
			System.out.println("A" + "\n");
		}
		else if(score>=84){ 
			System.out.println("B" + "\n");
		}
		else{ 
			System.out.println("C" + "\n");
		}
		
		System.out.print("성별 입력(여성이라면 1, 남성이라면 2) : ");
		gender = scan.nextInt( );
		
		if (gender == 1 && score >= 94) { 
			System.out.println("우리학교 우수학생");
		}
		else if(gender==2) { 
			System.out.println("우리 학교 학생이 아니네요");
		}
	}
}
