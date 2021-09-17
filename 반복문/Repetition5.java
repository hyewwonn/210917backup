package 반복문;

public class Repetition5 {
	/*숫자별찍기*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i<=5; i++) {
			for (int j = 1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k<=(i+i+1)-2; k++) {
				System.out.print(k);
			}
			System.out.println("");
		}
	}

}
