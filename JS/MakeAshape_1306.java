package JS;

import java.util.Scanner;

public class MakeAshape_1306 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("번호 입력 : ");
		n = scan.nextInt();
		
		switch(n) {
			case 1: getAshape1(); break;
			case 2: getAshape2(); break;
			case 3: getAshape3(); break;
			case 4: getAshape4(); break;
		}
		
	}//end of main
	public static void getAshape1() {
				for (int i = 1; i<=5; i++) {
					for (int j = 1; j<=5-i; j++) {
						System.out.print(" ");
					}
					for (int k = 1; k<=(i*2)-1; k++) {
						System.out.print("*");
					}
					System.out.println();
				}//삼각형
	}
							
	public static void getAshape2() {
				for (int i = 1; i<=5; i++) {
					for (int j = 1; j<=i-1; j++) {
						System.out.print(" ");
					}
					for (int k = 9; k>=(i*2)-1; k--) {
						System.out.print("*");
					}
					System.out.println();
				}//역삼각형
	}
				
	public static void getAshape3() {
		getAshape1();
		getAshape2();
	}
				
	public static void getAshape4() {
		getAshape2();
		getAshape1();
			
	}

}
