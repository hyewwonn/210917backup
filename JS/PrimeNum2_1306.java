package JS;

import java.util.Scanner;

public class PrimeNum2_1306 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int count = 0;
		int amount = 0;
		int result = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		num = scan.nextInt();
		
		for(int i = 1; i<=num; i++) {
			result = getCount(i, count, num);
			switch(result) {
			case 0: amount++; break;
			}
		}

		System.out.println("0 ~ "+num+"������ �Ҽ��� ������ �� "+amount+"�� �Դϴ�.");
			
	}//end of main
	public static int getCount(int i, int count, int num) {
		
		if(i == 1) {
			count ++;
		}
		else {
			for(int j = 2; j<i; j++) {
				if(i % j == 0) {
					count++;
				}
				else if(i == 2) {
					count = 0; break;
				}
				else {
					continue;
				}
			}//for
		}//outer else
		
		return(count);
	}

}
