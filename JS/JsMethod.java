package JS;

import java.util.Scanner;

public class JsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		passCount();
		int result = passCount();
		System.out.println("통과자는 "+result+"명입니다.");
		
		getClass(result);
	}
	
	public static int passCount() {
		int count = 0;
		int score;
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("점수 입력 : ");
			score = scan.nextInt();
			if (score>=80) {
				count++;
			}
			if (score < 0) {
				break;
			}
		}
		return(count);
	}
	public static void getClass(int result) {
		System.out.println(result);
		if(result>=3) {
			System.out.println("우수학급입니다.");
		}else {
			System.out.println("우수학급이 아닙니다.");
		}
	}

}
