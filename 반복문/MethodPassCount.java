package �ݺ���;

import java.util.Scanner;

public class MethodPassCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		passCount();
		int result = passCount();
		System.out.println("����ڴ� "+result+"���Դϴ�.");
		
		
		if(result>=3) {
			System.out.println("����б��Դϴ�.");
		}else {
			System.out.println("����б��� �ƴմϴ�.");
		}
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

}
