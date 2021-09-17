package JS;

import java.util.Scanner;

public class HashadNum_1306 {

	public static void main(String[] args) {
	      // TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num = scan.nextInt();
		int n = num;
		int length = 0;
		int sum = 0;

		for(int i =1; i<num; i*=10) {
			length = i;
		}
		while(length>=1) {
			sum += num/length;
			num = num % length;
			length/=10;
		}
		if(n % sum == 0) {
			System.out.println(n+"은 하샤드 수입니다.");
		}
		else {
			System.out.println(n+"은 하샤드 수가 아닙니다.");
		}

	}   

}
