package JS;

import java.util.Scanner;

public class JsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		passCount();
		int result = passCount();
		System.out.println("����ڴ� "+result+"���Դϴ�.");
		
		getClass(result);
	}
	
	public static int passCount() {
		int count = 0;
		int score;
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("���� �Է� : ");
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
			System.out.println("����б��Դϴ�.");
		}else {
			System.out.println("����б��� �ƴմϴ�.");
		}
	}

}
