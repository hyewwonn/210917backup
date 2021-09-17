package JS;

public class ForAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = 'a';
		for (int i = 1; i<=3; i++) {
			for (int j = 1; j<=3-i; j++) {
				System.out.print(" ");
			}
			for (char k = 'A'; k<=((char)(i+i+'A')-2); k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		for (int i = 1; i<=3; i++) {
			for (int j = 1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for (char k = 'Z'; k>=((char)(i+i+'V')-2); k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
