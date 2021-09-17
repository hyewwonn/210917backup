package JS;

import java.util.Scanner;

public class JsFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		num = scan.nextInt();
		
		for(int i = 1; i<=num; i++) {
			if(i%2==0) {
				System.out.println("++++++++++");
			}//if
			else {
				for(int k = 1; k<=10-i; k++) {
					System.out.print("!");
				}//innerfor1
				for(int s = 1; s<=i; s++) {
					System.out.print("*");
				}//innerfor2
				System.out.println();
			}//else
		}//outerfor
	}

}
