package ¹Ýº¹¹®;

public class Star_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=5; i++) {
			for (int j = 2; j<=i; j++) {
				System.out.print("  ");
			}
			for (int j = 5; j>=i; j--) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
