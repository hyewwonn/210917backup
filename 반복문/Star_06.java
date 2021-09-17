package 반복문;

public class Star_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
}
