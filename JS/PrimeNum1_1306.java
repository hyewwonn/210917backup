package JS;

import java.util.Scanner;

public class PrimeNum1_1306 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		num = scan.nextInt();
		
		if(num == 1) {
			count ++;
		}
		else {
			for(int i = 2; i<num; i++) {
				if(num % i == 0) {
					count++;
				}
				else if(num == 2) {
					count = 0; break;
				}
				else {
					continue;
				}
			}
		}
		
		if(count == 0) {
			System.out.println(num+"��(��) �Ҽ��Դϴ�.");
		}
		else {
			System.out.println(num+"��(��) �Ҽ��� �ƴմϴ�.");
		}
	}

}
